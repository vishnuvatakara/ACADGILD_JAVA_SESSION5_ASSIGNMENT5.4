package myPack;
// implementing fixed stack 
public class FixedStack implements stack{
	private int a[],top;
	public FixedStack(int size)
	{
		a=new int[size];
		top=-1;
	}
	public void push(int i)
	{
		if(a.length-1==top)
		{
			System.out.println("stack over flow");
		
		}
		else
		{
			
			a[++top]=i;
		}
		
	}
	public int pop()
	{
		if(top<0)
		{
			System.out.println("stack under flow");
			return(0);
		}
		else
		{
			return a[top--];
		}
		
		
	}

}
