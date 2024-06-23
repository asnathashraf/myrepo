package com.tnsif.dayfour;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault()
	{
		System.out.println("default value:"+varDefault);
	}
	void methodPublic()
	{
		System.out.println("public value:"+varPublic);
	}
	void methodPrivate()
	{
		System.out.println("private value:"+varPrivate);
	}
	void methodProtected()
	{
		System.out.println("protected value"+varProtected);
	}
}
