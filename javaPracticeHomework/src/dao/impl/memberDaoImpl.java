package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.dbConnection;
import dao.memberDao;
import model.member;

public class memberDaoImpl implements memberDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("memberDaoImpl execute!!!");
	}

	@Override
	public void createMember(member m) {
		Connection conn = dbConnection.getDB();
		String sql = "insert into beauty_clinic.member(name,birthdate,gender,phone,address) " + "values(?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, m.getName());
			ps.setString(2, m.getBirthdate());
			ps.setInt(3, m.getGender());
			ps.setString(4, m.getPhone());
			ps.setString(5, m.getAddress());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean queryMemberAccount(String phone, String birthday) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.member where phone=? and birthdate=?";
		boolean x = false;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, phone);
			ps.setString(2, birthday);

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
	public member queryMember(String phone) {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.member where phone=?";
		member m = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, phone);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				m = new member();
				m.setMember_id(rs.getInt("member_id"));
				m.setName(rs.getString("name"));
				m.setBirthdate(rs.getString("birthdate"));
				m.setGender(rs.getInt("gender"));
				m.setPhone(rs.getString("phone"));
				m.setAddress(rs.getString("address"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public Object[][] queryAllMember() {
		Connection conn = dbConnection.getDB();
		String sql = "select * from beauty_clinic.member";
		List<member> l = new ArrayList<member>();
		Object[][] o = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				member m = new member();
				m.setMember_id(rs.getInt("member_id"));
				m.setName(rs.getString("name"));
				m.setBirthdate(rs.getString("birthdate"));
				m.setGender(rs.getInt("gender"));
				m.setPhone(rs.getString("phone"));
				m.setAddress(rs.getString("address"));
				l.add(m);
			}
			
			//為了填進Jtable的欄位比較方便
			o = new Object[l.size()][6];
			for (int i = 0; i < l.size(); i++) {
				o[i][0] = l.get(i).getMember_id();
				o[i][1] = l.get(i).getName();
				o[i][2] = l.get(i).getBirthdate();
				o[i][3] = l.get(i).getGender();
				o[i][4] = l.get(i).getPhone();
				o[i][5] = l.get(i).getAddress();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}

	@Override
	public void updateMember(member m) {
		Connection conn = dbConnection.getDB();
		String sql = "update beauty_clinic.member set name=?,phone=?,address=? where member_id=? and birthdate=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, m.getName());
			ps.setString(2, m.getPhone());
			ps.setString(3, m.getAddress());
			ps.setInt(4, m.getMember_id());
			ps.setString(5, m.getBirthdate());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMember(int member_id) {
		Connection conn = dbConnection.getDB();
		String sql = "delete from beauty_clinic.member where member_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, member_id);

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
