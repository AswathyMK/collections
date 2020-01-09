import java.util.*;
public class Hashset_Example1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		HashSet<Integer>set1=new HashSet<Integer>();//creating a set
		//adding elements to set using add()
		for(int i=0;i<n;i++)
		{
			int c=sc.nextInt();
			set1.add(c);
		
		}
		System.out.println(set1);
		int m=sc.nextInt();
		HashSet<Integer>set2=new HashSet<Integer>();//creating another set
		//adding elements to set
		for(int i=0;i<m;i++)
		{
			int p=sc.nextInt();
			set2.add(p);
		
		}
		
		System.out.println(set2);
		HashSet<Integer>union=new HashSet<Integer>(set1);//creating set for union by passing first set as object
		union.addAll(set2); //union operation is done  by using addAll() method 
		System.out.println("Union :  "+union);
		HashSet<Integer>intersection=new HashSet<Integer>(set1);//creating set for intersection by passing first set as object
		intersection.retainAll(set2);//intersection is done by using retainAll() method which return common elements
		System.out.println("Intersection : "+intersection);
		HashSet<Integer>Sym_dif=new HashSet<Integer>(set1);//creating set for Symmetric difference by passing first set as object
		Sym_dif.removeAll(set2);//Symmetric difference is done by using removeAll() method which remove common elements from set1 
		System.out.println("Symmetric difference : "+Sym_dif);
}

}
