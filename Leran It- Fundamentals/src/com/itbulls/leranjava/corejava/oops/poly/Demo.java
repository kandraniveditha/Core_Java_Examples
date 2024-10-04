package com.itbulls.leranjava.corejava.oops.poly;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		
		User contentManager = new ContentManager();
		User admin = new AdminUser();

		contentManager.validateAccessRights();
		admin.validateAccessRights();
		
		System.out.println();
		System.out.println("=================");
		System.out.println();
		
		Archiver zipArchiver = new ZipArchiver();
		Archiver rarArchiver = new RarArchiver();
		
		zipArchiver.achiverFiles(new File(""));
		zipArchiver.achiverFiles(new File(""));
		
		System.out.println();
		System.out.println("=================");
		System.out.println();
		
		contentManager.getProfileInformation(new UserProfile());
	}

}
