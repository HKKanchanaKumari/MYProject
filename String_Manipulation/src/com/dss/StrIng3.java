package com.dss;

public class StrIng3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //String without new - Immutable
		String s= "ratan";
		s.concat("kumar");
		System.out.println(s);
		
		  System.out.println("======================");
		    
		//String buffer - Mutable
				StringBuffer s1= new StringBuffer("ratan");
				s1.append("_kmc");
				System.out.println(s1);
		
				  System.out.println("======================");
				    
		 //String without new - Immutable
				String sn= "ratan";
				sn=sn.concat("_manipal");
				System.out.println(sn);
				  System.out.println("======================");
				    
	}

}
