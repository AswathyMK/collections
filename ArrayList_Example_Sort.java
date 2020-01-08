import java.util.*;
public class ArrayList_Example_Sort 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> marks=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int c=sc.nextInt();
			marks.add(c);
		}
		ArrayList<Integer>sorted=(ArrayList<Integer>)marks.clone();//To make a copy of actual list
		System.out.println("Actual list: "+marks);
		Collections.sort(sorted);// To sort the list
		System.out.println("Sorted list :"+sorted);

	}

}
