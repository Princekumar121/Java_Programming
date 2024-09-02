public class Name {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread 1 name: " + t1.getName());
        System.out.println("Thread 2 name: " + t2.getName());
        System.out.println("Thread 1 priority: " + t1.getPriority());
        System.out.println("Thread 2 priority: " + t2.getPriority());
    }
   
    static class MyRunnable implements Runnable {
        public void run() {
        }
    }
   }
   
