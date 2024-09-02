//Write a class for following scenerio
//The employee have four attributes name, id, salary, company name
//The employee have list of methods
// void setId(int id)
// void setName(String name)
// void setSalary(int salary)
// void setCompanyName(String companyName)
// int getId()
// String getName()
// int getSalary()
//if employee are considered from same , then use an efficient memory management technique to handle company name
public class Employee {
     int id;
   String name;
     int salary;
   static String companyName;
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
     void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public String getCompanyName(){
        return companyName;
    }
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setId(1);
        e1.setName("Rahul");
        e1.setSalary(10000);
        e1.setCompanyName("Google");
        e2.setId(2);
        e2.setName("Rohit");
        e2.setSalary(20000);
        System.out.println("The id of e1 is: "+e1.getId());
        System.out.println("The name of e1 is: "+e1.getName());
        System.out.println("The salary of e1 is: "+e1.getSalary());
        System.out.println("The company name of e1 is: "+e1.getCompanyName());
        System.out.println("The id of e2 is: "+e2.getId());
        System.out.println("The name of e2 is: "+e2.getName());
        System.out.println("The salary of e2 is: "+e2.getSalary());
        System.out.println("The company name of e2 is: "+e2.getCompanyName());
    }

    
}

