package com.grandblue.graphql.server.jpa.repositories

import com.grandblue.graphql.server.jpa.entities.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProductRepository : JpaRepository<ProductEntity, Int> {

  @Query("SELECT * FROM product WHERE delete_flag = 0", nativeQuery = true)
  fun getProducts(): List<ProductEntity>

  @Query("SELECT * FROM product WHERE delete_flag = 0 AND product_id = :productId", nativeQuery = true)
  fun getProduct(productId: UUID): ProductEntity?
}