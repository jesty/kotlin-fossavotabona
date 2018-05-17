package it.devday.kotlincodemotion.domain

import javax.persistence.Embeddable

@Embeddable
data class ValueAddedTax(val percentage: Double)