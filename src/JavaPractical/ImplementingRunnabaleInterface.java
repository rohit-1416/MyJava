package JavaPractical;

class ImplementingRunnabaleInterface implements Runnable {
     public void run() {
         System.out.println("Runnig Thread");
     }

     public static void main(String[] args) {
         ImplementingRunnabaleInterface obj = new ImplementingRunnabaleInterface();
         Thread t1 = new Thread(obj);
         t1.start();
     }
 }