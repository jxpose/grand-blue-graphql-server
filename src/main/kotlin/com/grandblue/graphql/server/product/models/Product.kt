package com.grandblue.graphql.server.product.models

import com.grandblue.graphql.server.jpa.entities.ProductEntity
import java.io.Serializable

data class Product(
  val seq: Int,
  val productId: String,
  val productName: String,
  val productDescription: String,
  val deleteFlag: Boolean
) : Serializable {

  constructor(productEntity: ProductEntity) : this(
    seq = productEntity.seq,
    productId = productEntity.productId.toString(),
    productName = productEntity.productName,
    productDescription = productEntity.productDescription,
    deleteFlag = productEntity.deleteFlag
  )

  companion object {
    private const val serialVersionUID: Long = 1L
  }
}

