package com.itbulls.leranjava.corejava.oops.poly;

public class ContentManager extends User {
	
	public void validateAccessRights() {
		System.out.println("I'm am content manager. i have no enough rights to withdraw money");
	}

	@Override
	public ProfileInformationData getProfileInformation(Profile profile) {
		// TODO Auto-generated method stub
		return new AccountInformation();
	}

	

}
