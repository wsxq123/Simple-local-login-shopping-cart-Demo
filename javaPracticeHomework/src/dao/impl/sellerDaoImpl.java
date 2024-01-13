package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.dbConnection;
import dao.sellerDao;
import model.member;
import model.seller;

public class sellerDaoImpl implements sellerDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createSeller(seller s) {
		Connection conn = dbConnection.getDB();
		String sql = "Insert into beauty_clinic.seller(seller_name,password,seller_brithdate)" + "values(?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getSeller_name());
			ps.setString(2, s.getPassword());
			ps.setString(3, s.getSeller_brithdate());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean querySellerAccount(int seller_id, String password) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.seller where seller_id=? and password=?";
		boolean x = false;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, seller_id);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				x = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public seller querySeller(int seller_id, String seller_brithdate) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.seller where seller_id=? and seller_brithdate=?";
		seller s = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, seller_id);
			ps.setString(2, seller_brithdate);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				s = new seller();
				s.setSeller_id(rs.getInt("seller_id"));
				s.setSeller_name(rs.getString("seller_name"));
				s.setPassword(rs.getString("password"));
				s.setSeller_brithdate(rs.getString("seller_brithdate"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	@Override
	public Object[][] queryAllSeller() {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.seller";
		List<seller> l = new ArrayList<seller>();
		Object[][] o = new Object[l.size()][4];

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				seller s = new seller();
				s.setSeller_id(rs.getInt("seller_id"));
				s.setSeller_name(rs.getString("seller_name"));
				s.setPassword(rs.getString("password"));
				s.setSeller_brithdate(rs.getString("seller_brithdate"));
				l.add(s);
			}
			//為了填進Jtable的欄位比較方便
			for (int i = 0; i < l.size(); i++) {
				o[i][0] = l.get(i).getSeller_id();
				o[i][1] = l.get(i).getSeller_name();
				o[i][2] = l.get(i).getPassword();
				o[i][3] = l.get(i).getSeller_brithdate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}

	@Override
	public void updateSeller(seller s) {
		Connection conn = dbConnection.getDB();
		String sql = "update beauty_clinic.seller set seller_name=?,password=? where seller_id=? and seller_brithdate=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getSeller_name());
			ps.setString(2, s.getPassword());
			ps.setInt(3, s.getSeller_id());
			ps.setString(4, s.getSeller_brithdate());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteSeller(int seller_id) {
		Connection conn = dbConnection.getDB();
		String sql = "delete from beauty_clinic.seller where seller_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, seller_id);

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
