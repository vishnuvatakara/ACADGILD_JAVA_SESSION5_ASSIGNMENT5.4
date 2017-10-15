package myPack;
// implementing variable stack
public class VariableStack implements stack {
	private int a[],top;
	public VariableStack(int size)
	{
		a=new int[size*size];
		top=-1;
	}
	public void push(int i)
	{	
		if(a.length-1==top)
		{	
			//System.out.println("stack over flow");
			a[++top]=i;
		
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
