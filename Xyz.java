import java.util.*;
 class pro_cons{
    LinkedList<Integer>list=new LinkedList<>();
    int capacity=2;
    void produce()throws InterruptedException{
      int data=0;
      while(true){
        synchronized(this){
            while(list.size()==capacity){
                wait();
                
            }
            System.out.println("Going to produce");
            System.out.println("Item produce ="+data);
            list.add(data++);
            notify();
            Thread.sleep(1000);
        }
      }
    }
    void consume()throws InterruptedException{
        
        while(true){
          synchronized(this){
              while(list.size()==capacity){
                  wait();
              }
              System.out.println("Going to consume");
              int data=list.removeFirst();
              System.out.println("Item consume ="+data);
              notify();
              Thread.sleep(1000);
          }
        }
      }

}
class A extends Thread{
    pro_cons d;
    A(pro_cons d){
        this.d=d;
    }
    public void run(){
        try{
            d.produce();
        }
        catch(InterruptedException e){
            System.out.println("error");
        }
    }

}
class B extends Thread{
    pro_cons d;
    B(pro_cons d){
        this.d=d;
    }
    public void run(){
        try{
            d.consume();
        }
        catch(InterruptedException e){
            System.out.println("error");
        }
    }

}
public class Xyz {
    public static void main(String args[]){
     pro_cons d=new pro_cons();
     A th1=new A(d);
     th1.start();
     B th2=new B(d);
     th2.start();
    }
}
