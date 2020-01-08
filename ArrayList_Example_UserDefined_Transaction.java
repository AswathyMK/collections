import java.util.*;
class Customer
{
	private ArrayList<Double>transactions;
	private ArrayList<String>name;
	public Customer(String name,double initialAmount)
	{
	this.name=new ArrayList<String>();
	this.transactions = new ArrayList<Double>();
	addTransaction(initialAmount);
	addName(name);
	
	}
	//storing the transactions in a separate array list of type double
	
	public void addTransaction(double amount)
	{
		this.transactions.add(amount);
	}
	//storing the customer name in a separate array list of type string
	
	public void addName(String c_name)
	{
		this.name.add(c_name);
	}
	public ArrayList<String> getName()
	{
		return name;
	}
	public ArrayList<Double> getTransactions()
	{
		return transactions;
	}
}

public class ArrayList_Example_UserDefined_Transaction 
{

	public static void main(String[] args)
	{
		ArrayList<Customer>customers=new ArrayList<Customer>();
		Customer customer1=new Customer("john",20000D);
		customer1.addTransaction(30000D);
		customer1.addTransaction(50000D);
		customers.add(customer1);
		Customer customer2=new Customer("Tim",15000D);
		customer2.addTransaction(20000D);
		customers.add(customer2);
		//printing transactions
		for(int i=0;i<customers.size();i++)
		{
			Customer customer=customers.get(i);
			for(int k=0;k<customer.getName().size();k++)
			{
				String customer_name=customer.getName().get(k);
				System.out.println(customer_name);
				
			}
			for(int j=0;j<customer.getTransactions().size();j++)
			{
				Double transactions=customer.getTransactions().get(j);
				System.out.println(transactions);
			}
		}
	}
}
