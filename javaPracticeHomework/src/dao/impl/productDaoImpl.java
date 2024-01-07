package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.dbConnection;
import dao.productDao;
import model.member;
import model.product;
import model.seller;

public class productDaoImpl implements productDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createProduct(product p) {
		Connection conn = dbConnection.getDB();
		String sql = "Insert into beauty_clinic.product(product_name,product_price)" + "values(?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getProduct_name());
			ps.setInt(2, p.getProduct_price());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public product queryProduct(int product_id) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.product where product_id=?";
		product p = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, product_id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				p = new product();
				p.setProduct_id(rs.getInt("product_id"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_price(rs.getInt("product_price"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	@Override
	public product queryProductIDByName(String product_name) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.product where product_name=?";
		product p = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, product_name);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				p = new product();
				p.setProduct_id(rs.getInt("product_id"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_price(rs.getInt("product_price"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<product> queryAllProduct() {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.product";
				
		List<product> l = new ArrayList();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				product p = new product();
				p = new product();
				p.setProduct_id(rs.getInt("product_id"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_price(rs.getInt("product_price"));
				l.add(p);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public void updateProduct(product p) {
		Connection conn = dbConnection.getDB();
		String sql = "update beauty_clinic.product set product_name=?,product_price=? where product_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getProduct_name());
			ps.setInt(2, p.getProduct_price());
			ps.setInt(3, p.getProduct_id());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteProduct(int product_id) {
		Connection conn = dbConnection.getDB();
		String sql = "delete from beauty_clinic.product where product_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, product_id);

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
