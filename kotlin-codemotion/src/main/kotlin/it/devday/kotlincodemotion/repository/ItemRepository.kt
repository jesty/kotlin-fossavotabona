package it.devday.kotlincodemotion.repository

import it.devday.kotlincodemotion.domain.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository: JpaRepository<Item, Long>