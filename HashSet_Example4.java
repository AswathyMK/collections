import java.util.*;
import java.lang.Math;
public class HashSet_Example4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<Integer>set=new HashSet<Integer>();//creating HashSet
		//adding elements to HashSet
		for(int i=0;i<n;i++)
		{
			int s=sc.nextInt();
			set.add(s);
		}
		System.out.println("Numbers : "+set);
		set.remove(10);//remove 10
		System.out.println("After remove(10) :"+set);
		HashSet<Integer>set1=new HashSet<Integer>();//creating new set
		
		for(int n3:set)
		{
			int n4=n3;
			int n5=(int) Math.sqrt(n4);//find square root
			if((n5*n5)==n4)//check if it is a perfect square or not
			{
			set1.add(n4);
			}
			
		}
		set.removeAll(set1);
		System.out.println("After remove (perfect squares) : "+set);
		set.clear();
		System.out.println(set);
		
		
	}

}
