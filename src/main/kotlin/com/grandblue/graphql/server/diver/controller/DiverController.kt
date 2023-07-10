package com.grandblue.graphql.server.diver.controller

import com.grandblue.graphql.server.diver.models.Diver
import com.grandblue.graphql.server.diver.service.DiverService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class DiverController(val diverService: DiverService) {

  @QueryMapping
  fun getDivers() : List<Diver> {
    return diverService.getDiverList()
  }

  @QueryMapping
  fun getDiver(@Argument diverId: String) : Diver? {
    return diverService.getDiver(diverId)
  }

  @MutationMapping
  fun addDiver(@Argument diverName: String, @Argument divingLevel: Int = 1, @Argument divingLicenseNumber: String = "") : Diver {
    return diverService.addDiver(diverName, divingLevel, divingLicenseNumber)
  }
}