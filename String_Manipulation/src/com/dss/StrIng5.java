package com.dss;
/*
 * class Object
 * {
 * String toString()
 * {System.out.println(s);
 * }
 */
public class StrIng5 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	StrIng5 s=new StrIng5();
	System.out.println(s);
	System.out.println(s.toString());//object class tostring method executes
	
	String sn=new String("amar");
	System.out.println(sn);
	System.out.println(sn.toString());//return content of the string obj
	//same for string buffer & str, str new opr
	/*


		public class String extends StrIng5{
		public String toString()
		{
			return "content of the string obj";
		}}
		
		public class StringBuffer extends StrIng5{
		public String toString()
		{
			return "content of the stringbuffer obj";
		}}	
	
*/
}}
