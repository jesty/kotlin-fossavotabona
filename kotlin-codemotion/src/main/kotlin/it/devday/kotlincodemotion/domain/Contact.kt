package it.devday.kotlincodemotion.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Contact(
        @Id
        @GeneratedValue
        val id: Long,
        val name: String,
        val surname: String)