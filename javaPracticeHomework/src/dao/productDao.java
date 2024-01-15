package dao;

import java.util.List;

import model.product;

public interface productDao {
	
// create
	void createProduct(product p);

// read
	// single product search(productSearchUI)
	product queryProduct(String product_id);
	
	product queryProductIDByName(String product_name);

	// products search(productSearchUI)
	List<product> queryAllProduct();
	
	// products search(productSearchUI)
	Object[][] queryAllProductByObject();

// update
	// (productSearchUI)
	void updateProduct(product p);

// delete
	// (productSearchUI)
	void deleteProduct(String product_id);

}
