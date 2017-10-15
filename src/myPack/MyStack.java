package myPack;

public class MyStack {
public static void main(String args[])
{
	FixedStack obj1=new FixedStack(5);
	for(int j=0;j<7;++j)
	{
		obj1.push(j);
	}
	for(int j=0;j<9;++j)
	{
		System.out.println(obj1.pop());
	}
	System.out.println("==========variable stack========");
	VariableStack obj2=new VariableStack(5);
	
	for(int j=0;j<7;++j)
	{
		obj2.push(j);
	}
	for(int j=0;j<9;++j)
	{
		System.out.println(obj2.pop());
	}
}
}