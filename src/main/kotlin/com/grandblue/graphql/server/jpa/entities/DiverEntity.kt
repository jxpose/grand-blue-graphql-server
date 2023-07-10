package com.grandblue.graphql.server.jpa.entities

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

//Since No arg constructor plugin is not working add default values
@Entity
@Table(name = "diver")
class DiverEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "seq")
  var seq: Int = 0,

  @Column(name = "diver_id", columnDefinition = "BINARY(16)")
  var diverId: UUID = UUID.randomUUID(),

  @Column(name = "diver_name")
  var diverName: String = "",

  @Column(name = "diving_level")
  var divingLevel: Int = 1,

  @Column(name = "diving_license_number")
  var divingLicenseNumber: String = "",

  ) : Serializable {
  companion object {
    private const val serialVersionUID: Long = 1L
  }
}
