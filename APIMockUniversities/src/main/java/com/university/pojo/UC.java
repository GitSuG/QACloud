package com.university.pojo;

public class UC {

	public static final String UNI_NAME = "name";
	public static final String UNI_USERNAME = "username";
	public static final String UNI_PASSWORD = "password";
	public static final String UNI_CONTACTS = "contact";
	public static final String UNI_STUDENTS = "students";

	public static String UNI_INDEX ;
	public static final String DOT = ".";
	
	public static String index(int index) {
		
		return UNI_INDEX = "["+ index+"]";
	}
}
