package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.business.contracts.IProductService;
import com.springboot.entities.Product;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	
	private  IProductService _productService;
	
	
	public ProductController(IProductService _productService) {
		  this._productService = _productService;
	}
	
	
  	@GetMapping("")
    public ResponseEntity<List<Product>>  getAll() {
        return new ResponseEntity<>(_productService.listAll(), HttpStatus.OK);
    }

 
    @PostMapping("")
    public ResponseEntity<Product> saveOrUpdate(@RequestBody Product model) {
    	 return new ResponseEntity<>(_productService.saveOrUpdate(model), HttpStatus.OK);
    }


    @DeleteMapping("")
    public ResponseEntity delete(@RequestBody Product model){
    	_productService.deleteModel(model);
     	 return new ResponseEntity(HttpStatus.OK);
    }
    
}
