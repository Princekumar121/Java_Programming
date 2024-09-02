//Wap to count the number of object called using static variable



public class CountNumber {
    
    static int count = 0;
    CountNumber()
    {
        count++;
    }

    public static void main(String args[]){
        CountNumber c1 = new CountNumber();
        CountNumber c2 = new CountNumber();
        CountNumber c3 = new CountNumber();
        CountNumber c4 = new CountNumber();
        CountNumber c5 = new CountNumber();
        System.out.println("The number of object created is: "+count);
    }
}
