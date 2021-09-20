package com.mot.test;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionTest {
	
	public static void main(String[] args) {
	ArrayList<String> arlist=new ArrayList<String>();
		arlist.add("dog");
		arlist.add("cat");
		arlist.add("rabbit");
		
		
		Collections.sort(arlist);
		System.out.println(arlist);
		
				
	}

}
