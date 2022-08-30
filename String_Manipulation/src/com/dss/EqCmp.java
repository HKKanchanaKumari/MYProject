package com.dss;

public class EqCmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equals() -> return type -> boolean
      String s1="arun";
      String s2="ratan";
      String s3="arun";
		System.out.println(s1.equals(s2));//f
		System.out.println(s1.equals(s3));//t
		System.out.println(s3.equals(s2));//f
		System.out.println("anu".equals("ANU"));//f
		System.out.println("anu".equalsIgnoreCase("ANU"));//t
		
		System.out.println("=================================");
		
		
		//compareTo() -> return type -> int 
		String s11="arun";//a=0
	      String s22="datan";//r=17
	      String s33="arun";//a=0
	      System.out.println(s11.compareTo(s22));//1-17=-17
	      System.out.println(s11.compareTo(s33));//0-0=0
	      System.out.println(s22.compareTo(s33));//17-0=17
	      System.out.println("ratan".compareTo("RATAN"));//114-82=32
	      System.out.println("ratan".compareToIgnoreCase("RATAN"));//114-114=0
	}

}
