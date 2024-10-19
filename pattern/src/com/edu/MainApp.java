package com.edu;

interface AreaFig{
	   void area();
	}
	class Reactange implements AreaFig{
	   public void area(){
	      int l=7;
	      int b=9; 
	      int a=l*b;
	      System.out.println("Area of reactangle="+a);
	   }
	}

	class Square implements AreaFig{
	    public void area(){
	      int l=7;
	       int a=l*l;
	      System.out.println("Area of square="+a);
	   }
	}

	public class MainApp{
	   public static void main(String args[]){
	      AreaFig ob;
	     ob=new Reactange();
	      ob.area();
	     ob=new Square();
	      ob.area();
	  }
	}

