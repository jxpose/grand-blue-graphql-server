package com.grandblue.graphql.server.diver.service

import com.grandblue.graphql.server.jpa.repositories.DiverRepository
import com.grandblue.graphql.server.diver.models.Diver
import com.grandblue.graphql.server.jpa.entities.DiverEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class DiverService(val diverRepository: DiverRepository) {

  fun getDiverList() : List<Diver> {
    return diverRepository.getDivers().map { Diver(it) }
  }

  fun getDiver(diverId: String) : Diver? {
    return diverRepository.getDiver(UUID.fromString(diverId))?.let { Diver(it) }
  }

  fun addDiver(diverName: String, divingLevel: Int, divingLicenseNumber: String) : Diver {
    val savedDiverEntity = diverRepository.save(
      DiverEntity().apply {
      this.diverName = diverName
      this.divingLevel =  divingLevel
      this.divingLicenseNumber = divingLicenseNumber
      }
    )

    return Diver(savedDiverEntity)
  }
}