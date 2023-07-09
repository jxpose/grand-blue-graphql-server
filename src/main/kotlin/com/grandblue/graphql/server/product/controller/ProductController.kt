package com.grandblue.graphql.server.product.controller

import com.grandblue.graphql.server.product.models.Product
import com.grandblue.graphql.server.product.service.ProductService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class ProductController(val productService: ProductService) {

  @QueryMapping
  fun getProducts() : List<Product> {
    return productService.getProductList()
  }

  @QueryMapping
  fun getProduct(@Argument productId: String) : Product? {
    return productService.getProduct(productId)
  }
}