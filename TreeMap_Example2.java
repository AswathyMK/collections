import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TreeMap_Example2 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of values to be inserted in map:");
		int n=Integer.parseInt(sc.readLine());
		int i;
		TreeMap<String,Integer> map=new TreeMap<String,Integer>();
		for(i=0;i<n;i++)
		{
			
			String s=sc.readLine();
			int c=Integer.parseInt(sc.readLine());
			map.put(s,c);
			//System.out.println(map);
		}
		System.out.println(map);
		System.out.println("Enter the index to be removed :");
		String s1=sc.readLine();
		map.remove(s1);
		System.out.println(map);
		System.out.println("Enter the index to insert :");
		String s2=sc.readLine();
		System.out.println("Enter the value to insert :");
		int n1=Integer.parseInt(sc.readLine());
		map.put(s2,n1);
		System.out.println(map);

	}

}
