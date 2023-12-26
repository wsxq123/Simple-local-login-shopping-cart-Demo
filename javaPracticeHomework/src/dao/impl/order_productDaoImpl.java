package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.dbConnection;
import dao.order_productDao;
import model.order_product;
import model.product;

public class order_productDaoImpl implements order_productDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createOrder_prduct(order_product op) {
		Connection conn = dbConnection.getDB();
		String sql="Insert into beauty_clinic.order_product(order_number,product_id,amount,cost)\" + \"values(?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, op.getOrder_number());
			ps.setInt(2, op.getProduct_id());
			ps.setInt(3, op.getAmount());
			ps.setInt(4, op.getCost());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<order_product> queryOorder_product(String order_number) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.order_product";
		List<order_product> l = new ArrayList();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				order_product op = new order_product();
				op = new order_product();
				op.setOrder_number(rs.getString("order_number"));
				op.setProduct_id(rs.getInt("product_id"));
				op.setAmount(rs.getInt("amount"));
				op.setCost(rs.getInt("cost"));
				l.add(op);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public void deleteOrder_prduct(String order_number) {
		Connection conn = dbConnection.getDB();
		String sql = "delete from beauty_clinic.order_product where order_number=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, order_number);

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
