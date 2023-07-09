package com.grandblue.graphql.server.jpa.entities

import jakarta.persistence.*
import org.hibernate.annotations.Generated
import org.hibernate.generator.EventType
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "diver")
class DiverEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "seq")
  var seq: Int,

  @Generated(event = [EventType.INSERT])
  @Column(name = "diver_id", columnDefinition = "BINARY(16)")
  var diverId: UUID,

  @Column(name = "diver_name")
  var diverName: String,

  @Column(name = "diving_level")
  var divingLevel: Int,

  @Column(name = "diving_license_number")
  var divingLicenseNumber: String,

  ) : Serializable {
  companion object {
    private const val serialVersionUID: Long = 1L
  }
}
