import java.util.Scanner;
import java.util.TreeSet;

public class CompareTo_Employee_Main 
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		n=sc.nextInt();
		TreeSet<CompareTo_Employee> treeset=new TreeSet<CompareTo_Employee>();//creating treeset of class type Employee
		CompareTo_Employee[] emp=new CompareTo_Employee[n];//creating array of class object
		//adding elements to treeset
		
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new CompareTo_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			treeset.add(emp[i]);
			
			
		}
		//returning elements from treeset
		for(CompareTo_Employee e:treeset)
		{
			System.out.println(e.getName()+" "+e.getAge());
		}
		sc.close();
	}

}
