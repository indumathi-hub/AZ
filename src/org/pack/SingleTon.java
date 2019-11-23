package org.pack;

public class SingleTon {
static SingleTon s;
private SingleTon() {
}
public static SingleTon getInstance()
{
if(s==null)
{
	s=new SingleTon();
}
System.out.println(s);
return s;
}
public void empId()
{
	System.out.println("empid is 100");
	
}
public static void main(Indu[] args) {
	SingleTon si=getInstance();
	System.out.println(si);
	si.empId();
	
}















}
