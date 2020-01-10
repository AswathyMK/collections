import java.util.*;
public class LinkedHashMap_Example1 
{

	public static void main(String[] args) 
	{
		Map<String,Integer>map=new LinkedHashMap<String,Integer>();//creating LinkedHashMap
		//adding elements
		map.put("ONE",1);
		map.put("TWO",2);
		map.put("THREE",3);
		map.put("FOUR",4);
		//printing elements
		for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  

	}

}
