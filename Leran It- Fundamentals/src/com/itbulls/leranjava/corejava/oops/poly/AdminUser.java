package com.itbulls.leranjava.corejava.oops.poly;

public class AdminUser extends User{

	private final String userGrop = "admin";
	
	@Override
	public void validateAccessRights() {
		System.out.println("I'm an admin user. i can do whatever i want in the system. ");
	}
	
	public AccountInformation getProfileInformation(Profile profile) {
		//userGroup = "default";
		//profile = new UserProfile();
		return new AccountInformation();
	}

}
