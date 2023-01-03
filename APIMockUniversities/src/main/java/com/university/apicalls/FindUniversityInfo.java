package com.university.apicalls;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FindUniversityInfo {

//	static String url = "https://api.postman.com/collections/20174971-1d762d39-a877-409e-bc40-ee3c202b141e?access_key=PMAT-01GNE7Y4J2BME62G8J7BW64J1B";
	static String url = "http://localhost:3002/";
	
	static Response response;

	public static void getAllUniInfo() {

//		url = "https://cc5b8f14-6465-4d22-9cc7-684862d57604.mock.pstmn.io/";
		
		RestAssured.baseURI = url;
		response = RestAssured.given().get("allUniversities").andReturn();

	}

	public static void getUniInfo(String uniKey, String message) {
//		getAllUniInfo();
		System.err.println(message+ "     :: "+ response.jsonPath().getString(uniKey));
	}

	public static void getStudentInfo(String studentKey, String message) {
//		getAllUniInfo();
		System.err.println(message+ "     :: "+ response.jsonPath().getString(studentKey));
	}
	
	public static int objectSize(String key) {
//		System.out.println(key);
		List<String> l =  response.jsonPath().getList(key);
		return l.size();
	}

}
