package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.dbConnection;
import dao.orderDao;
import model.order;

public class orderDaoImpl implements orderDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createOrder(order o) {
		Connection conn = dbConnection.getDB();
		String sql="Insert into beauty_clinic.order(order_Number,order_Date,order_Time,member_id,seller_id,total)"
				+  "values(?,?,?,?,?,?)";

		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, o.getOrder_Number());
			ps.setString(2, o.getOrder_Date());
			ps.setString(3, o.getOrder_Time());
			ps.setString(4, o.getMember_id());
			ps.setString(5, o.getSeller_id());
			ps.setInt(6, o.getTotal());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public order queryOrder(String order_Number) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.order where order_Number=?";
		order o = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, order_Number);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				o = new order();
				o.setOrder_Number(rs.getString("order_Number"));
				o.setOrder_Date(rs.getString("order_Date"));
				o.setOrder_Time(rs.getString("order_Time"));
				o.setMember_id(rs.getString("member_id"));
				o.setSeller_id(rs.getString("seller_id"));
				o.setTotal(rs.getInt("total"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}

	@Override
	public Object[][] queryOrderByDate(String dateStart, String dateEnd) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.order "
				   + "WHERE beauty_clinic.order.order_Date BETWEEN ? AND ?";
		
		List<order> l = new ArrayList<order>();
		Object[][] ob = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dateStart);
			ps.setString(2, dateEnd);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				order o = new order();
				o = new order();
				o.setOrder_id(rs.getInt("order_id"));
				o.setOrder_Number(rs.getString("order_Number"));
				o.setOrder_Date(rs.getString("order_Date"));
				o.setOrder_Time(rs.getString("order_Time"));
				o.setMember_id(rs.getString("member_id"));
				o.setSeller_id(rs.getString("seller_id"));
				o.setTotal(rs.getInt("total"));
				
				l.add(o);
			}
			
			ob = new Object[l.size()][7];
			for (int i = 0; i < l.size(); i++) {
				ob[i][0] = l.get(i).getOrder_id();
				ob[i][1] = l.get(i).getOrder_Number();
				ob[i][2] = l.get(i).getOrder_Date();
				ob[i][3] = l.get(i).getOrder_Time();
				ob[i][4] = l.get(i).getMember_id();
				ob[i][5] = l.get(i).getSeller_id();
				ob[i][6] = l.get(i).getTotal();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ob;
	}

	@Override
	public void deleteOrder(String order_Number) {
		Connection conn = dbConnection.getDB();
		String sql = "delete from beauty_clinic.order where order_Number=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, order_Number);

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
