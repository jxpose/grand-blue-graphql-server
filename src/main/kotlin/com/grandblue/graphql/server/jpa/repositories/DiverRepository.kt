package com.grandblue.graphql.server.jpa.repositories

import com.grandblue.graphql.server.jpa.entities.DiverEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DiverRepository : JpaRepository<DiverEntity, Int> {

  @Query("SELECT * FROM diver WHERE delete_flag = 0", nativeQuery = true)
  fun getDivers(): List<DiverEntity>

  @Query("SELECT * FROM diver WHERE delete_flag = 0 AND diver_id = :diverId", nativeQuery = true)
  fun getDiver(diverId: UUID): DiverEntity?
}