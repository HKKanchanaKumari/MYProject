package com.dss;
import java.util.StringTokenizer;
public class StrTok {

	public static void main(String[] args) {
	StringTokenizer st = new StringTokenizer("hi sir class completed");
	while(st.hasMoreElements())//to check tokens available
	{
		String s =(String) st.nextElement();//to read the tokens&conver st to s
		System.out.println(s);
	}
	System.out.println("===================");
	StringTokenizer st1 = new StringTokenizer("hi s.ir c.lass. completed",".");
	while(st1.hasMoreTokens())//to check tokens available
	{
		String s1 =(String) st1.nextToken();//to read the tokens&conver st to s
		System.out.println(s1);
	}
	}

}
