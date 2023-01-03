package com.university.tests;

import org.testng.annotations.Test;
import java.util.List;

import org.testng.annotations.Test;

import com.university.apicalls.FindUniversityInfo;
import com.university.pojo.SC;
import com.university.pojo.UC;

public class UniversityTest extends BaseTest{


	@Test
	public void testUniversity_1usernames() {
		
//		find value of all usernames
		FindUniversityInfo.getUniInfo(UC.UNI_USERNAME, "11.  All usernames\n");
	}

	@Test
	public void testUniversity_2student() {
//		find values of all student id
		FindUniversityInfo.getStudentInfo(UC.UNI_STUDENTS+SC.DOT+SC.S_ID, "12.  Values of all student id\n");
		
		
//		find  last value of student id
		int u = FindUniversityInfo.objectSize(UC.UNI_NAME);
		int s = FindUniversityInfo.objectSize(UC.UNI_STUDENTS+SC.index(u-1)+SC.DOT+SC.S_ID);
		
//		System.out.println("Number of students (last uni):: "+ s);
		FindUniversityInfo.getStudentInfo(UC.UNI_STUDENTS+SC.index(u-1)+SC.DOT+SC.S_ID+SC.index(s-1), 
							"13.  Last value of student id\n");
	}
	

	@Test
	public void testUniversity_3() {
//		find username of 1st university
		FindUniversityInfo.getUniInfo(UC.UNI_USERNAME+UC.index(0), "14.  Username of 1st university\n");
		
//		find name of 2nd university
		FindUniversityInfo.getUniInfo(UC.UNI_NAME+UC.index(1), "15.  Name of 2nd university\n");
		
//		find number of universities in the list
		System.err.println("16.  Number of universities :: "+ 
				FindUniversityInfo.objectSize(UC.UNI_NAME));
		
	}
}
