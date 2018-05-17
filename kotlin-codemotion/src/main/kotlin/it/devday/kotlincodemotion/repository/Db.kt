package it.devday.kotlincodemotion.repository

import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory

/**
 * Created by davidecerbo on 16/05/2018.
 */

@Component
object Db : ApplicationContextAware {

    var ac: ApplicationContext? = null

    override fun setApplicationContext(applicationContext: ApplicationContext?) {
        ac = applicationContext!!
    }

    fun exec(callback: (em: EntityManager) -> Any): Any {
        return callback(ac!!.getBean(EntityManagerFactory::class.java).createEntityManager())
    }

}