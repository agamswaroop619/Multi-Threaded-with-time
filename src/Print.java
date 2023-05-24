import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;

import static java.lang.Thread.currentThread;

public class Print implements Runnable{
    static int thread=0;
    static long time=0;
    @Override
    public void run() {
        time = time+System.currentTimeMillis();
        long threadId = currentThread().getId();
        String fileName = "text_" + threadId + "_.txt";
        FileWriter writer;

        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i=1; i<=(1000000000/thread);i++)
        {
            String s= i +" " + currentThread().getId();
            try {
                writer.write(s);
                writer.write("\n");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printnumbers(int i) throws InterruptedException {
        Runnable runnable = new Print();
        long start= System.currentTimeMillis();
        for(int j=1;j<=i;j++)
        {
            thread= i;
            Thread d1 = new Thread(runnable);
            System.out.println("Printing "+j+"th time");
            d1.start();
            d1.join();

        }
        long end= System.currentTimeMillis();
        System.out.println("Time tTaken"+(end-start));
    }
}
