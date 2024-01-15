package dao;

import model.member;

public interface memberDao {
	
//create
	void createMember(member m);

//read
	// check member exist (memberLoginUI)
	boolean queryMemberAccount(String phone, String birthday);

	// single member search (memberSearchUI)
	member queryMember(String phone);

	// all member search (memberSearchUI)
	Object[][] queryAllMember();

//update 
	// (memberSearchUI)
	void updateMember(member m);

//delete 
	// (memberSearchUI)
	void deleteMember(int member_id);

}
