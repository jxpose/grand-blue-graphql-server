package com.grandblue.graphql.server.product.controller

import com.grandblue.graphql.server.product.models.Diver
import com.grandblue.graphql.server.product.service.DiverService
import org.springframework.graphql.data.method.annotation.Argument
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
}