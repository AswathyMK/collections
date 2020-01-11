import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class LinkedHashMap_Example2 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));//Creating Buffer object
		System.out.println("Enter the number of values to be inserted in map:");
		int n=Integer.parseInt(sc.readLine());//reading limit
		int i;
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();//creating LinkedHashMap
		//Adding elements to LinkedHashMap
		for(i=0;i<n;i++)
		{
			
			String s=sc.readLine();
			int c=Integer.parseInt(sc.readLine());
			map.put(s,c);
			
		}
		System.out.println("Enter the index to be removed :");
		String s1=sc.readLine();
		map.remove(s1);//Removing elements using key 
		
		System.out.println(map);
		System.out.println("Size :"+map.size());
		
	}

}
