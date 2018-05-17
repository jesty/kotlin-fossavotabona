package it.devday.kotlincodemotion.repository;

import javax.persistence.EntityManager

interface Dao<T, K>

inline fun <reified T : Any, K> Dao<T, K>.findAll(): List<T> = Db.exec { em ->
    em.createQuery("Select t from " + T::class.java.simpleName + " t").resultList
} as List<T>

inline fun <reified T : Any, K> Dao<T, K>.findById(id: K): T = Db.exec { em -> em.find(T::class.java, id) } as T

inline fun <reified T : Any, K> Dao<T, K>.save(item: T): Unit = Db.exec { em ->
    tx(em) {  em.persist(item) } } as Unit

inline fun <reified T : Any, K> Dao<T, K>.delete(id: K): T = Db.exec { em ->
    tx(em) {
        val item: T = em.find(T::class.java, id)
        em.remove(item)
        return@tx item
    }
} as T

fun tx(em: EntityManager, c: () -> Any): Any {
    try {
        em.transaction.begin()
        val result = c()
        em.transaction.commit()
        return result
    } finally {
        em.close()
    }
}

