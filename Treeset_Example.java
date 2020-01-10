import java.util.Scanner;
import java.util.TreeSet;
public class Treeset_Example 
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeSet<Employee> treeset=new TreeSet<Employee>();//creating treeset of class type Employee
		Employee[] emp=new Employee[n];//creating array of class object
		//adding elements to treeset
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			treeset.add(emp[i]);
			
			
		}
		//returning elements from treeset
		for(Employee e:treeset)
		{
			System.out.println(e.getName()+" "+e.getAge());
		}
		sc.close();
		
		
	}

}
