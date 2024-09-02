import java.util.*;
class stud
{     
   public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n=sc.nextInt();
		int[] roll=new int[n+1];
		int[] sub1=new int [n+1];
		int[] sub2=new int [n+1];
		int[] sub3=new int [n+1];
		int[] total=new int [n+1];
		System.out.println("Enter roll number: ");
		for(int i=0;i<n;i++)
		{
			roll[i]=sc.nextInt();
		}
		System.out.println("Enter marks of first subject of all students: ");
		for(int i=0;i<n;i++)
		{
			sub1[i]=sc.nextInt();
		}
		System.out.println("Enter marks of second subject of all students: ");
		for(int i=0;i<n;i++)
		{
			sub2[i]=sc.nextInt();
		}
		System.out.println("Enter marks of third subject of all students: ");
		for(int i=0;i<n;i++)
		{
			sub3[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			total[i]=sub1[i]+sub2[i]+sub3[i];
		}
		System.out.println("Total is: ");
		for(int i=0;i<n;i++)
		{	
			System.out.println(total[i]);
                         }
		System.out.println("RollNo. "+"Sub1 "+"Sub2 "+"Sub3 "+"Total");
		for(int i=0;i<n;i++)
		{
			System.out.println("  "+roll[i]+"    "+sub1[i]+"   "+sub2[i]+"   "+sub3[i]+"   "+total[i]);
		}
		int a1=sub1[0],a2=sub2[0],a3=sub3[0];
		for(int i=0;i<n;i++)
		{
			if(a1<sub1[i])
			{
				a1=sub1[i];
			}
		}
		System.out.println("sub1 highest marks "+a1);
		for(int i=0;i<n;i++)
		{
			if(a2<sub2[i])
			{
				a2=sub2[i];
			}
		}
		System.out.println("sub2 highest marks "+a2);
		for(int i=0;i<n;i++)
		{
			if(a3<sub3[i])
			{
				a3=sub3[i];
			}
		}
		System.out.println("sub3 highest marks "+a3);
		int a=total[0],b=0;
		for(int i=0;i<n;i++)
		{
			if(a<total[i+1])
			{	
				a=total[i+1];
				b=i+1;
			}
		}
		System.out.println("RollNo."+roll[b]+" "+"Overall Highest marks "+a);
}
}
