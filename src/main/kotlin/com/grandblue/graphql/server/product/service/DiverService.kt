package com.grandblue.graphql.server.product.service

import com.grandblue.graphql.server.jpa.repositories.DiverRepository
import com.grandblue.graphql.server.product.models.Diver
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
}