//An electrcity board chragees the following rates to domestic users to discourage large consumption of eneergy 

//for the next 100 units: 60p per unit 
//for the next 200 units: 80p per unit 
//for the next 300 units: 90p per unit 

//All user are charged minimum of rs 50
//if the total amount is more tha ra 300 then an additional lsubcharge of 15 percent is added 
//WAP to read thr names of users and number of units consumed and display the charges with names
//make the class fot this 


  
import java.util.Scanner;

class Bill{
    private String name;
    private int units;
    private float charge, total;

    Bill(){}

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the user: ");
        name = sc.nextLine();
        System.out.print("Enter the number of units consumed: ");
        units = sc.nextInt();
    }

    void calculate(){
        if(units <= 100){
            charge = units * 0.60f+50;
        }
        else if(units <= 300){
            charge = 50+100 * 0.60f + (units - 100) * 0.80f;
        }
        else if(units > 300){
            charge = 50+(100 * 0.60f) + (200 * 0.80f) + ((units - 300) * 0.90f);
        }
        
         if(charge > 300){
            total = charge + charge * 0.15f;
            charge = total;
        }
   
    }

    void display(){
        System.out.println("Name of the user: " + name);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Total amount to be paid: " + charge);
    }

    public static void main(String[] args) {
        Bill b = new Bill();
        b.getdata();
        b.calculate();
        b.display();
    }

}

 


