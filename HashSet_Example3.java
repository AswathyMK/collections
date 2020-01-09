import java.util.*;
public class HashSet_Example3 
{

	public static void main(String[] args) 
	{
		HashSet<String>popularCities=new HashSet<String>();//creating HashSet
		System.out.println("Is popularCities set empty? :"+popularCities.isEmpty());//check whether the set is empty or not
		//Adding elements to set
		popularCities.add("London");
		popularCities.add("New York");
		popularCities.add("Paris");
		popularCities.add("Dubai");
		System.out.println("Number of cities in th HashSet : "+popularCities.size());//getting the size of set
		//checks whether the set contain element paris
		if(popularCities.contains("Paris"))
		{
			System.out.println("Paris is in the popular cities set");
		}
		
	}

}
