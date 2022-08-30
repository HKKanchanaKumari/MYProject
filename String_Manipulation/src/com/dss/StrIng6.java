package com.dss;

public class StrIng6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//str to sb
String str ="ratan";
StringBuffer sb=new StringBuffer(str);
System.out.println(sb);
System.out.println(sb.reverse());

//sb to str
System.out.println("======================");
StringBuffer sb1=new StringBuffer("durga");
String str1 =sb1.toString();
System.out.println(str1);


	}

}
