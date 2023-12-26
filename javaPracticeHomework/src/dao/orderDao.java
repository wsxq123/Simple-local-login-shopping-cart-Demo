package dao;

import java.util.List;

import model.member;
import model.order;

public interface orderDao {
	
//create
	void createOrder(order o);

//read
	// single order search (orderSearchUI)
	order queryOrder(int order_id);

	// single order search by date(orderSearchUI)
	order queryOrderByDate(int order_Date);

	// orders search by a Time Range(orderSearchUI)
	List<order> queryOrderByTimeRange(int dateStart, int dateEnd);

//update

//delete
	// (orderSearchUI)
	order deleteOrder(int order_number);

}
