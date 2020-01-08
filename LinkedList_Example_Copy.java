import java.util.*;
public class LinkedList_Example_Copy 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<String> list=new LinkedList<String>();//creating linkedlist
		//adding elements to linked list
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			list.add(s);
		}
		int m=sc.nextInt();
		ArrayList<String> alist=new ArrayList<String>();//creating array list
		//adding elements to array list
		for(int j=0;j<m;j++)
		{
			String s1=sc.next();
			alist.add(s1);
			
		}
		
		System.out.println("Actual LinkedList : "+list);
		list.addAll(alist);//copy the value of arraylist to linkedlist list
		System.out.println("After copy "+list);
		
	}

}
