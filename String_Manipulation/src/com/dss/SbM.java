package com.dss;

public class SbM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//====STRINGBUFFER METHODS======
      StringBuffer s =new StringBuffer("ratanit");
      System.out.println(s.delete(0, 2));
      System.out.println(s.deleteCharAt(3));
      System.out.println(s.reverse());
      System.out.println(s.append("_MM"));
      System.out.println(s.insert(1, "oy_"));
      System.out.println(s.replace(4, 7, "I'm"));
      
      System.out.println("==========================");
      StringBuffer m=new StringBuffer("Nayan");
      System.out.println(m.reverse());
      System.out.println(m.reverse());
      System.out.println(m.append("_Kumar"));
      System.out.println(m.replace(6, 11, "Kumari"));
      System.out.println(m.delete(7, 12));
      System.out.println(m.deleteCharAt(5));
      System.out.println(m.deleteCharAt(5).insert(5, "_Kumar"));
	}

}
