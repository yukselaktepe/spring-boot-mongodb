package com.springboot.business.contracts;

import com.springboot.entities.Product;
import java.util.List;

public interface IProductService {
	
	List<Product> listAll();

    Product saveOrUpdate(Product product);

    void deleteModel(Product product);
}
