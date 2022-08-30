package com.dss;

public class StrMet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STRING METHODS
		//====================
  String s1="ratan";
  System.out.println("charat: " + s1.charAt(2)); //t
  System.out.println("indexof: "+ s1.indexOf('a')); //1
  System.out.println("lastindex: "+ s1.lastIndexOf('a')); //3
  System.out.println("length: "+ s1.length());//5
  
  String m="hello, sir u ";
  System.out.println(m.startsWith("hello")); //true
  System.out.println(m.startsWith("sir"));//false
  System.out.println(m.endsWith("u"));//true
  System.out.println(m.contains("sir"));//true
  
  
  
	}

}
