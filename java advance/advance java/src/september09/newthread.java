package september09;

import java.util.logging.Level;
import java.util.logging.Logger;


class threaad1 implements Runnable{

    @Override
    public void run() {
       for(int i=0;i<=10;i++){
           try {
               Thread.sleep(1000);
               System.out.print(i+" ");
           } catch (InterruptedException ex) {
                 
           }
       }
        System.out.println(" ");
    }
    
}
public class newthread {
    public static void main(String[] args) {
        System.out.println("start");
        threaad1 th =new threaad1();
        Thread th1 = new Thread(th);
        
        try {
            th1.wait(6000);
        } catch (Exception ex) {
           }
        th1.start();
        
        System.out.println("finished");
    }
     
}
