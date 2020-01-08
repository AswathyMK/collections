import java.util.*;
public class LinkedList_Example 
{

	public static void main(String[] args)
	{
		List<String> word=new LinkedList<String>();//Creating linked list
		word.add("Competition");//adding element to linked list
		word.add("Be positive");
		word.add("Happy day");
		Iterator<String>itr=word.iterator();//creating iterator object
		while(itr.hasNext())//checks if there is any next element or not 
		{
			System.out.println(itr.next());//returns elements in linked list
		}
	}

}
