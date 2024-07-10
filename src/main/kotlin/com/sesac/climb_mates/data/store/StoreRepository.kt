package com.sesac.climb_mates.data.store

import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface StoreRepository:JpaRepository<Store, Long> {
    fun findByStyle(style: String): Optional<List<Store>>
}