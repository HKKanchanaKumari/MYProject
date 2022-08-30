package com.dss;

public class StrIng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1="ratan1";
     String s2=new String("ratan2");
     System.out.println(s1);
     System.out.println(s2);
     
     char[] ch= {'a','b','c','d'};
     System.out.println(ch);
     String s3=new String( ch , 1, 3);
     System.out.println(s3);
     
     byte[] b = {65,66,67,68,69,70};
     System.out.println(b);
     String s4=new String(b);
     System.out.println(s4);
     String s44=new String(b,1,3);
     System.out.println(s44);
     
     
     
     

	}

}
