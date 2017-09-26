package com.niit.dao;
import java.util.List;
import com.niit.model.Product;

public interface ProductDAO {
	void saveProduct();
	List<Product>getAllProduts();
	Product getProductById();

}
