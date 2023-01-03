package com.university.pojo;

public class SC {

	public static final String S_ID = "id";
	public static final String S_NAME = "name";
	public static final String S_MARKS = "marks";
	public static final String S_CONTACT = "contact";
	public static final String S_ADDRESSES = "addresss";
	public static final String S_STATE = "state";
	public static final String S_CITY = "city";
	
	public static  String S_INDEX;
	public static final String DOT = ".";
	
	
	public static String index(int index) {
		return S_INDEX= "["+ index+"]";
	}
}
