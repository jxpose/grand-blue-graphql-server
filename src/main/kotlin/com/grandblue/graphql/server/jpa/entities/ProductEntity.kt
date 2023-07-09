package com.grandblue.graphql.server.jpa.entities

import jakarta.persistence.*
import org.hibernate.annotations.Generated
import org.hibernate.generator.EventType
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "product")
class ProductEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "seq")
  var seq: Int,

  @Generated(event = [EventType.INSERT])
  @Column(name = "product_id", columnDefinition = "BINARY(16)")
  var productId: UUID,

  @Column(name = "product_name")
  var productName: String,

  @Column(name = "product_description")
  var productDescription: String,

  @Column(name = "delete_flag")
  var deleteFlag: Boolean

  ) : Serializable {

  companion object {
    private const val serialVersionUID: Long = 1L
  }
}
