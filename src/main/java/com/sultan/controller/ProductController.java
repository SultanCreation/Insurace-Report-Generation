package com.sultan.controller;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sultan.bindings.Product;

@RestController
public class ProductController {
      @GetMapping(value ="/getProduct",
    		      produces = { "application/json","application/xml" })
      
	public ResponseEntity<Product> getProduct(){ 
		Product productData = new Product();
		productData.setId(11);
		productData.setName("mOuse");
		productData.setPrice(50.44);
		return new ResponseEntity<>(productData,HttpStatus.OK);
	}
      @GetMapping("/getProducts")
      public ResponseEntity<List<Product>> getProducts(){
    	  Product p1 = new Product(101,"laptop",59999.33);
    	  Product p2 = new Product(102,"peanut Butter",599.33);
    	  Product p3 = new Product(103,"watch",5999.33);
    	  Product p4 = new Product(104,"Mouse",59.33);
    	  List<Product> products = Arrays.asList(p1,p2,p3,p4);
    	  return new ResponseEntity<>(products,HttpStatus.OK);
      }
}
