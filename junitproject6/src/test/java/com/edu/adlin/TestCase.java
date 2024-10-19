package com.edu.adlin;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
@Test//positive
public void add() {
	int a,b,s;
	a=10;
	b=5;
	s=a+b;
	assertEquals(15,s);
}


@Test //subtraction
public void sub() {
	int a,b,v;
	a=20;
	b=10;
	v=a-b;
	assertEquals(10,v);
	
}
@Test //Multiplication
public void mul() {
	int a,b,m;
	a=15;
	b=5;
	m=a*b;
	assertEquals(75,m);
	
}
	
@Test//Division
public void div() {
	int a,b,n;
	a=10;
	b=2;
	n=a/b;
	assertEquals(5,n);
}	
}