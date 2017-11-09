package it.devday.kotlincodemotion.repository

import it.devday.kotlincodemotion.domain.Contact
import org.springframework.data.jpa.repository.JpaRepository

interface ContactRepository: JpaRepository<Contact, Long>