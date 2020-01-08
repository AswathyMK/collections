import java.util.*;

 class Contacts
{
	private String name;
	private String phone_no;
	public Contacts(String name,String phone_no)
	{
		this.name=name;
		this.phone_no=phone_no;
	
	}
	public String getName()
	{
		return name;
	}
	public String getPhone()
	{
		return phone_no;
	}
}


public class ArrayList_Example_UserDefined 
{

	public static void main(String[] args) 
	{
		ArrayList<Contacts>contact=new ArrayList<Contacts>();//Creating arrayList of type class contact
		Contacts obj=new Contacts("tim","5378263");//creating object for class contact and passing value to constructor
		Contacts obj1=new Contacts("John","5276382");
		contact.add(obj);         //adding values to list
		contact.add(obj1);
		for(int i=0;i<contact.size();i++)
		{
			System.out.print(contact.get(i).getName()+" ");//getting name
			System.out.print(contact.get(i).getPhone()+" ");//getting phone number
    	   
		}
    }
     

}


