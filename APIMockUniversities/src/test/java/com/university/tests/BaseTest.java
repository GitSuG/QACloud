package com.university.tests;

import org.testng.annotations.BeforeTest;

import com.university.apicalls.FindUniversityInfo;

public class BaseTest {

	@BeforeTest
	public void loadData() {
		FindUniversityInfo.getAllUniInfo();
	}
}
