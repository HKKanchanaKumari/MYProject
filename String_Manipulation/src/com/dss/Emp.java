package com.dss;

public class Emp {
   int eid1;
   String eid2;
   public Emp(int eid1,String eid2)
   {
	super();
   	this.eid1=eid1;
   	this.eid2=eid2;
   }
   @Override
	public String toString() {
		return "eid1=" + eid1 + " eid2=" + eid2 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Emp e=new Emp(10,"20");
    System.out.println("e="+e);
    System.out.println("tostring()=" +e.toString());
	}

	
}
