package dao;

import java.util.List;

import model.order;

public interface orderDao {
	
//create
	void createOrder(order o);

//read
	// single order search (orderSearchUI)
	order queryOrder(String order_Number);

	// orders search by date(orderSearchUI)
	Object[][] queryOrderByDate(String dateStart, String dateEnd);

//update

//delete
	// (orderSearchUI)
	void deleteOrder(String order_Number);

}
