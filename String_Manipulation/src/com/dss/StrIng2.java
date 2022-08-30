package com.dss;

public class StrIng2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without new opr -scp
		String s1="ratan";
		String s2="anu";
		String s3="ratan";
		 System.out.println(s1==s2);
	     System.out.println(s2==s3);
	     System.out.println(s3==s1);
		
		//with new opr  -- heap
	     System.out.println("======================");
				String str1=new String("ratan");
				String str2=new String("anu");
				String str3=new String("ratan");
				 System.out.println(str1==str2);
			     System.out.println(str2==str3);
			     System.out.println(str3==str1);
	 //sb
			     System.out.println("======================");
			     StringBuffer sb1=new StringBuffer("ratan");
			     StringBuffer sb2=new StringBuffer("anu");
			     StringBuffer sb3=new StringBuffer("ratan");
			     System.out.println(sb1==sb2);
			     System.out.println(sb2==sb3);
			     System.out.println(sb3==sb1);
				

	}

}
