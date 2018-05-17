package it.devday.kotlincodemotion.domain

import javax.persistence.Embeddable

@Embeddable
data class Quantity(val value: Double)
