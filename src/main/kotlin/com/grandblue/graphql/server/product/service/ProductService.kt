package com.grandblue.graphql.server.product.service

import com.grandblue.graphql.server.jpa.repositories.ProductRepository
import com.grandblue.graphql.server.product.models.Product
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(val productRepository: ProductRepository) {

  fun getProductList() : List<Product> {
    return productRepository.getProducts().map { Product(it) }
  }

  fun getProduct(productId: String) : Product? {
    return productRepository.getProduct(UUID.fromString(productId))?.let { Product(it) }
  }
}