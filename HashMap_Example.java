import java.util.*;
public class HashMap_Example 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of HashMap :");
		int n=sc.nextInt();
		Map<Integer,String>map=new HashMap<Integer,String>();//creating HashMap
		System.out.println("values ");
		//adding values to HashMap
		for(int i=0;i<n;i++)
		{
			int m=sc.nextInt();
			String s=sc.next();
			map.put(m,s);
			
			
		}
		System.out.println("Enter the Key : ");
		int m1=sc.nextInt();
		System.out.println("Enter the value :");
		String s1=sc.next();
		System.out.println(map.containsKey(m1));//checks whether the key contained in HashMap
		System.out.println(map.containsValue(s1));//checks whether the value contained in HashMap
	}

}
