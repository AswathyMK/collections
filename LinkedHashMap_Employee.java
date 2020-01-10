
public class LinkedHashMap_Employee implements Comparable<LinkedHashMap_Employee>
{
	private String name;
	private int age;
	//to return name
	public String getName()
	{
		return name;
	
	}
	//to set name to global variable
	public void setName(String name)
	{
		this.name=name;
    }//return age
	public int getAge()
	{
		return age;
	}
	//to set age to global variable
	public void setAge(int age)
	{
		this.age=age;
	}
	@Override
	public int compareTo(LinkedHashMap_Employee o) {
		
		return 1;
	}
	
}
