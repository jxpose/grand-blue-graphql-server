package com.grandblue.graphql.server.product.models

import com.grandblue.graphql.server.jpa.entities.DiverEntity
import java.io.Serializable

data class Diver(
  val diverId: String,
  val diverName: String,
  val divingLevel: Int,
  val divingLicenseNumber: String
): Serializable {

  constructor(diverEntity: DiverEntity) : this(
    diverId = diverEntity.diverId.toString(),
    diverName = diverEntity.diverName,
    divingLevel = diverEntity.divingLevel,
    divingLicenseNumber = diverEntity.divingLicenseNumber,
  )

  companion object {
    private const val serialVersionUID: Long = 1L
  }
}