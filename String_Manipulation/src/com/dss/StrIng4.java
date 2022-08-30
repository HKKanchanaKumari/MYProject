package com.dss;

public class StrIng4 {
	StrIng4(String str)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//object (string)class ->ref comp
			StrIng4 s1=new StrIng4("anu");
			StrIng4 s2=new StrIng4("anu");
			System.out.println(s1.equals(s2));
			System.out.println("StrIng2(with using new opr) ref or equals opr:" );
			System.out.println(s1==s2);
			System.out.println("======================");
			
			//string cls -> content comp
			String s3="anu";
			String s4="anu";
			System.out.println(s3.equals(s4));
			System.out.println("StrIng2(with using new opr) ref or equals opr:" );
			System.out.println(s3==s4);
			System.out.println("======================");
			
			//stringbuffer cls -> ref comp
			StringBuffer s5=new StringBuffer("anu");
			StringBuffer s6=new StringBuffer("anu");
			System.out.println(s5.equals(s6));
			System.out.println("StrIng2(with using new opr) ref or equals opr:" );
			System.out.println(s5==s6);
			System.out.println("======================");			
	}

}
