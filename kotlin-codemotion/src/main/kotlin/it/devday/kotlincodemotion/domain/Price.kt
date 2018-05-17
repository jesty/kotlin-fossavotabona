package it.devday.kotlincodemotion.domain

import javax.persistence.Embeddable

@Embeddable
data class Price(val amount: Double) {
    operator fun plus(a: Price) = a.amount + this.amount
    operator fun rem(a: ValueAddedTax) = this.amount * (100 + a.percentage) / 100
}