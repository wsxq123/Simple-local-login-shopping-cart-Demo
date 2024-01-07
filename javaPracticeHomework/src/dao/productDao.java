package dao;

import java.util.List;

import model.product;

public interface productDao {
	
// create
	void createProduct(product p);

// read
	// single product search(productSearchUI)
	product queryProduct(int product_id);
	
	product queryProductIDByName(String product_name);

	// products search(productSearchUI)
	List<product> queryAllProduct();

// update
	// (productSearchUI)
	void updateProduct(product p);

// delete
	// (productSearchUI)
	void deleteProduct(int product_id);

}
