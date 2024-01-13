package dao;

import java.util.List;

import model.order;
import model.seller;

public interface sellerDao {

//create
	void createSeller(seller s);

//read
	// check member exist (sellerLoginUI)
	boolean querySellerAccount(int seller_id, String password);

	// single seller search (sellerSearchUI)
	seller querySeller(int seller_id, String seller_brithdate);
	
	// all seller search
	Object[][] queryAllSeller();

//update
	// (sellerSearchUI)
	void updateSeller(seller s);

//delete
	// (sellerSearchUI)
	void deleteSeller(int seller_id);

}
