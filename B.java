public class B implements Runnable {
    int start;
    int end;
    public B(int start, int end) {
        this.start = start;
        this.end = end;
    }
   public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new B(1, 10), "Thread 1");
        Thread t2 = new Thread(new B(1, 10), "Thread 2");
        Thread t3 = new Thread(new B(1, 10), "Thread 3");
         t1.start();
        t2.start();
        t3.start();
    }
   }
   
