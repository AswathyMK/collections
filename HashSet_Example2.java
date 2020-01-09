import java.util.*;
public class HashSet_Example_2 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> alist=new ArrayList<Integer>();//creating Arraylist
		//adding elements to ArrayList
		for(int i=0;i<n;i++)
		{
			int s=sc.nextInt();
			alist.add(s);
		}
		HashSet<Integer> set=new HashSet<Integer>();//creating HashSet
        	//Adding elements of ArrayList to HashSet using addAll() method
        	set.addAll(alist);
        	System.out.println(set);
    	}

}
