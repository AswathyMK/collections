import java.util.*;
public class Arraylist_Example_Reverse 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> stationary=new ArrayList<String>();
	    for(int i=0;i<n;i++)
	    {
	    	String s=sc.next();
	    	stationary.add(s);
	    }
	    System.out.println(stationary);
	    List<String>newlist=new ArrayList<String>();
	    for(int j=n-1;j>=0;j--)
	    {
	    	newlist.add(stationary.get(j));
	    	
	    }
	    System.out.println(newlist);
		
	}

}
