package dao;

import java.util.List;

import model.member;

public interface memberDao {
//create
	void createMember(member m);
	
//read
	//single member search (memberSearchUI)
	member queryMember(int phone,int birthday);
	
	//all member search (memberSearchUI)
	List<member> queryAllMember();
	
	//check member exist (memberLoginUI)
	boolean queryMemberAccount(int phone,int birthday);
	
//update 
	//(memberSearchUI)
	void updateMember(member m);
	
	
//delete 
	//(memberSearchUI)
	void deleteMember(int member_id);
	

}
