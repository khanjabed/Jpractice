package com.usa.javaexamples;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import cucumber.api.cli.Main;

//This all are Collection framework Practices for interview and work place too

public class CollectionPractices {

	public static void stringArrayTest() {

		// This is moudood class

		String[] name = { "alam", "refat", "moudood", "Trisha", "Bhabi" };

		System.out.println(Arrays.toString(name));

		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i]);
		}
	}

	public static void integerArrayTest() {

		// This is refat class

		int[] numlist = { 34, 56, 76, 23 };

		for (int x : numlist) {

			System.out.println(x);
		}

		System.out.println(Arrays.toString(numlist));

	}

	public static void ArrayListTest() {

		List<String> value = new ArrayList<>();

		value.add("Java");

		value.add("Selenium");

		value.add("Cucumber");

		value.add("TestNG");

		value.add("Maven");

		value.add("Jenkins");

		value.add("Java");

		value.add(null);

		System.out.println(value);

	}

	public static void listImplementClass() {
		
		int [] array = {1,2,2,2,2,2,2,};	
	
	ArrayList obj= new ArrayList();
	
	List<Integer>a=new ArrayList<>();
	a.add(10);
	List<Integer> b=new LinkedList<>();
	b.add(10);
	List<Integer>c=new Vector<>();
	c.add(10);
	List<Integer>d=new Stack<>();
	};
		
	
	public static void findmaxandmin() {
		List<Integer> num = new ArrayList<>();
		
		num.add(10);
		num.add(11);
		num.add(33);
		num.add(44);
		num.add(55);
		num.add(66);
		
		System.out.println(num.size());
		System.out.println(num);
		for (int i=0;i<num.size();i++) {
			System.out.println(num);
			
			int max= Collections.max(num);
			int min= Collections.max(num);
		};
		
		
	};
	
	
	public static void findsecondSalary() {//akhar
		int obj []= {11,22,33,44,55,66,77};
		int alam=obj.length;
		Arrays.sort(obj);
		System.out.println(Arrays.toString(obj));
		int result = obj[alam-3];
		System.out.println("My second value: "+result);
	};
	
	
	public static void findduplicatevalue() {
	String [] name  ={ "java","ruby","python","PHP","c++","java","c#"};
	Set<String> store= new HashSet<>();
	
//	for (String names : name) {//advance for loop
		if (store.add(names)==false) {
			System.out.println(names);
		}
	}
	
	}
	
	
	
	
	
	
	
	
		
	public static void main(String[] args) {

		// stringArrayTest();

		// integerArrayTest();

		//ArrayListTest();
		//findmaxandmin();
		//findmaxandmin();
		//findmaxandmin();
		//findsecondSalary();
		findduplicatevalue();

}}