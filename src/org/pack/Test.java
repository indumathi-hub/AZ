package org.pack;

public class Test {
	private void search() {
		
	String empName="Indhu";
	if(empName.contains("hi"))
	{
System.out.println("emplyee is here");
}
	else
	{
	try {
		throw new Employeenotfoundexception();
	} catch (Employeenotfoundexception e) {
		e.printStackTrace();
	}

	finally
	{
		System.out.println("Close Database");
	}
}
}
	public static void main(Indu[] args) {
		Test t=new Test();
		t.search();
	}
}