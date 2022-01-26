import java.util.*;
class employee
{
	int empno;
	String empname;
	long empphonenum;

    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		employee no[]=new employee[5];
		
		for(int i=0;i<5;i++)
		{
			no[i]=new employee();
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the details of employee"+" "+(i+1));
			
			System.out.print("Employee number:");
			no[i].empno=sc.nextInt();
			
			
			System.out.print("Employee name:");
			no[i].empname=sc.next();
			
			
			System.out.print("Employee phone number:");
			no[i].empphonenum=sc.nextLong();
			System.out.println("");
		}
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("The details of employee"+" "+(i+1)+" "+"is");

			System.out.print("Employee number:");
			System.out.print(no[i].empno);
			System.out.println("");

			System.out.print("Employee name:");
			System.out.print(no[i].empname);
			System.out.println("");

			System.out.print("Employee phone number:");
			System.out.print(no[i].empphonenum);
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
	
	
}




