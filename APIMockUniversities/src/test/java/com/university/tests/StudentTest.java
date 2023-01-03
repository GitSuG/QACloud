package com.university.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.university.apicalls.FindUniversityInfo;
import com.university.pojo.SC;
import com.university.pojo.UC;

public class StudentTest extends BaseTest {

	@Test
	public void testStudentUniversity_1() {

//		find all marks of second student of 1st university
		FindUniversityInfo.getStudentInfo(UC.UNI_STUDENTS + UC.index(0) + SC.index(1) + UC.DOT 
											+ SC.S_MARKS,"1.  All marks of second student of 1st university\n");

//		find the second state(in the address) value of first student of 1st university
		FindUniversityInfo
				.getStudentInfo(UC.UNI_STUDENTS + UC.index(0) + SC.index(0) + UC.DOT 
									+ SC.S_ADDRESSES + SC.index(1) + SC.DOT
										+ SC.S_STATE, "2.  Second state(in the address) value of first student of 1st university\n");

//		find addresses of first student of 1st university
		FindUniversityInfo.getStudentInfo(UC.UNI_STUDENTS + UC.index(0) + SC.index(0) + UC.DOT + 
											SC.S_ADDRESSES, "3.  Addresses of first student of 1st university\n");
	}
	
		@Test
		public void testStudentUniversity_2() {
//		find the second contact value of second student of 2nd university
		FindUniversityInfo.getStudentInfo(UC.UNI_STUDENTS + UC.index(1) + SC.index(1) + UC.DOT + 
											SC.S_CONTACT + SC.index(1), "4.  Second contact value of second student of 2nd university\n");

//		find all cities of second student of 2nd university
		FindUniversityInfo.getStudentInfo(UC.UNI_STUDENTS + UC.index(1) + SC.index(1) + UC.DOT + 
											SC.S_ADDRESSES + SC.DOT + 
											SC.S_CITY,	"5.  All cities of second student of 2nd university\n");
		}
		
		@Test
		public void testStudentUniversity_3counts() {
			
//		find number of addresses of second student of 2nd university
		int a = FindUniversityInfo.objectSize( UC.UNI_STUDENTS+ UC.index(1)  + SC.index(1) +SC.DOT+ 
												SC.S_ADDRESSES);
		System.err.println("6.  Number of addresses of second student of 2nd university :: " + a);

//		find the number of student records of 2nd university
		int s = FindUniversityInfo.objectSize(UC.UNI_STUDENTS+ UC.index(1) );
		System.err.println("7.  Number of student records of 2nd university :: " + s);

//		find the number of contacts of second student of 1st university
		int c = FindUniversityInfo.objectSize( UC.UNI_STUDENTS+ UC.index(0)  + SC.index(1) + SC.DOT +
												SC.S_CONTACT);
		System.err.println("8.  Number of contacts of second student of 1st university :: " + c);
		}
		
		@Test
		public void testStudentUniversity_4All() {
//		find names of all students
		FindUniversityInfo.getStudentInfo(UC.UNI_STUDENTS + SC.DOT + SC.S_NAME, "9.  Names of all students\n");

//		find contacts of all students
		FindUniversityInfo.getStudentInfo(UC.UNI_STUDENTS + UC.DOT + SC.S_CONTACT, "10.  Contacts of all students\n");
	}

}
