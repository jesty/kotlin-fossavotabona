package it.devday.kotlincodemotion.domain

import it.devday.kotlincodemotion.repository.Dao
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Item(
        @Id
        @GeneratedValue
        val id: Long,
        val description: String,
        @Embedded val vat: ValueAddedTax,
        @Embedded val price: Price,
        @Embedded val quantity: Quantity) {

    val grossPrice: Double
        get() = this.price % this.vat

    val total: Double
        get() = this.grossPrice * quantity.value

    companion object : Dao<Item, Long>

}