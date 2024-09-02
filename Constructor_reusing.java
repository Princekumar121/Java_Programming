//Write a program to perform the cosntuctor resuing in the class 
public class Constructor_reusing {
    int a,b;
    int c;
    Constructor_reusing(int x, int y){
        a = x;
        b = y;
    }
    Constructor_reusing(int x, int y, int z){
        this(x,y);
        c = z;
    }
    void display(){
        System.out.println("The value of a is: "+a);
        System.out.println("The value of b is: "+b);
        System.out.println("The value of c is: "+c);
    }
    public static void main(String args[]){
        Constructor_reusing c = new Constructor_reusing(10,20,30);
        c.display();
    }
}
