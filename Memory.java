import java.util.Scanner; 
class Memory{
static String name; 
static int unit;
static double amt=0.0; 
void inputInfo()
{
Scanner sc=new Scanner(System.in); 
System.out.print("Enter your name: "); 
name=sc.nextLine();
 System.out.print("Enter the unit: "); 
unit=sc.nextInt();
}
void Calculate()
{
if(unit<=100) 
amt=unit*0.6; 
else if(unit<=300)
amt=(100*0.6)+((unit-100)*0.8);
else if(unit>300) 
amt=(100*0.6)+(200*0.8)+((unit-300)*0.9);
amt=amt+50; 
if(amt>300)
amt=((15*amt)/100)+amt;
}
void displayInfo()
{
System.out.println("The name of the customer is : "+name); 
System.out.println("The unit consumed by the customer is : "+unit); 
System.out.println("The amount of the customer is : "+amt);
}
public static void main(String args[])
{
System.out.print("Enter the number of users : "); 
Scanner sc1=new Scanner(System.in);
int n=sc1.nextInt();

Memory ob[]=new Memory[n]; 
for(int i=0;i<n;i++)
{
ob[i]=new Memory(); 
ob[i].inputInfo();
 
ob[i].Calculate();
}
for(int i=0;i<n;i++)
{
ob[i].displayInfo();
}
}
}

