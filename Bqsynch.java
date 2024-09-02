class Display {
    synchronized void wish(String x) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("HELLO " + x);
        }
    }
}

class A extends Thread

{
    Display d;

    A(Display d) {
        this.d = d;
    }

    public void run() {
        d.wish("Sam");
    }
}

class B extends Thread {
    Display d;

    B(Display d) {
        this.d = d;
    }

    public void run() {
        d.wish("Leanord");
    }
}

class Bqsynch {
    public static void main(String args[]) {
        Display d = new Display();
        A th1 = new A(d);
        th1.start();
        B th2 = new B(d);
        th2.start();
    }
}
