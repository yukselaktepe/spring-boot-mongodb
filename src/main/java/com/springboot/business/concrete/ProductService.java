package com.springboot.business.concrete;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.business.contracts.IProductService;
import com.springboot.data.contracts.IProductRepository;
import com.springboot.entities.Product;

@Service
public class ProductService implements IProductService {
	
	   private IProductRepository productRepository;

	    public ProductService(IProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }


	    @Override
	    public List<Product> listAll() {
	        List<Product> products = new ArrayList<>();
	        productRepository.findAll().forEach(products::add); 
	        return products;
	    }



	    @Override
	    public Product saveOrUpdate(Product product) {
	        productRepository.save(product);
	        return product;
	    }

	    @Override
	    public void deleteModel(Product product) {
	        productRepository.delete(product);
	    }

}
