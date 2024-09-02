import java.util.*;

class met {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;

    void prod() throws InterruptedException {
        int data = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity) {
                    wait();
                }
            }
            System.out.println("Going to produce");
            System.out.println("the data is" + data);
            list.add(data++);
            notify();

            Thread.sleep(1000);

        }
    }

    void consume() throws InterruptedException {

        while (true) {
            synchronized (this) {
                while (list.size() == capacity) {
                    wait();
                }
            }
            System.out.println("Going to consume");
            System.out.println("the data is" + list.removeFirst());

            notify();

            Thread.sleep(1000);

        }
    }
}

class A extends Thread {
    met d;

    A(met d) {
        this.d = d;
    }

    public void rune() {
        try {
            d.prod();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class B extends Thread {
    met d;

    B(met d) {
        this.d = d;
    }

    public void rune() {
        try {
            d.consume();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class pro {
    public static void main(String args[]) {
        met obj = new met();
        A obj1 = new A(obj);
        obj1.start();
        B obj2 = new B(obj);
        obj2.start();
    }

}
