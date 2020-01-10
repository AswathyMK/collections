import java.util.Scanner;
import java.util.TreeSet;
public class Treeset_Example1_Main 
{

	public static void main(String[] args) 
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeSet<Treeset_Example1_Employee> treeset=new TreeSet<Treeset_Example1_Employee>();//creating treeset of class type Employee
		Treeset_Example1_Employee[] emp=new Treeset_Example1_Employee[n];//creating array of class object
		//adding elements to treeset
		for(i=0;i<n;i++)
		{
			name=sc.next();
			age=sc.nextInt();
			emp[i]=new Treeset_Example1_Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			treeset.add(emp[i]);
			
			
		}
		//returning elements from treeset
		for(Treeset_Example1_Employee e:treeset)
		{
			System.out.println(e.getName()+" "+e.getAge());
		}
		sc.close();
		
		
	}

}
