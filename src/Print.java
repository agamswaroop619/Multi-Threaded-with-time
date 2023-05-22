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
        System.out.println("Time take in "+Thread.currentThread().getName()+" thread"+ManagementFactory.getThreadMXBean().getThreadCpuTime(Thread.currentThread().getId()));
    }

    public void printnumbers(int i) {
        Runnable runnable = new Print();
        switch (i) {
            case 1 -> {
                thread=1;
                Thread d1 = new Thread(runnable);
                System.out.println("1st printing");
                d1.start();
            }
            case 2 -> {
                thread=2;
                Thread d2 = new Thread(runnable);
                System.out.println("2nd printing");
                d2.start();
                Thread d1 = new Thread(runnable);
                System.out.println("1st printing");
                d1.start();
            }
            case 4 -> {
                thread=4;
                Thread d4 = new Thread(runnable);
                System.out.println("4th printing");
                d4.start();
                Thread d3 = new Thread(runnable);
                System.out.println("3th printing");
                d3.start();
                Thread d2 = new Thread(runnable);
                System.out.println("2nd printing");
                d2.start();
                Thread d1 = new Thread(runnable);
                System.out.println("1st printing");
                d1.start();
            }
            case 8 -> {
                thread=8;
                Thread d8 = new Thread(runnable);
                System.out.println("8th printing");
                d8.start();
                Thread d7 = new Thread(runnable);
                System.out.println("7th printing");
                d7.start();
                Thread d6 = new Thread(runnable);
                System.out.println("6th printing");
                d6.start();
                Thread d5 = new Thread(runnable);
                System.out.println("5th printing");
                d5.start();
                Thread d4 = new Thread(runnable);
                System.out.println("4th printing");
                d4.start();
                Thread d3 = new Thread(runnable);
                System.out.println("3th printing");
                d3.start();
                Thread d2 = new Thread(runnable);
                System.out.println("2nd printing");
                d2.start();
                Thread d1 = new Thread(runnable);
                System.out.println("1st printing");
                d1.start();
            }
            case 16 -> {
                thread=16;
                Thread d16 = new Thread(runnable);
                System.out.println("16th printing");
                d16.start();
                Thread d15 = new Thread(runnable);
                System.out.println("15th printing");
                d15.start();
                Thread d14 = new Thread(runnable);
                System.out.println("14th printing");
                d14.start();
                Thread d13 = new Thread(runnable);
                System.out.println("13th printing");
                d13.start();
                Thread d12 = new Thread(runnable);
                System.out.println("12th printing");
                d12.start();
                Thread d11 = new Thread(runnable);
                System.out.println("11th printing");
                d11.start();
                Thread d10 = new Thread(runnable);
                System.out.println("10th printing");
                d10.start();
                Thread d9 = new Thread(runnable);
                System.out.println("9th printing");
                d9.start();
                Thread d8 = new Thread(runnable);
                System.out.println("8th printing");
                d8.start();
                Thread d7 = new Thread(runnable);
                System.out.println("7th printing");
                d7.start();
                Thread d6 = new Thread(runnable);
                System.out.println("6th printing");
                d6.start();
                Thread d5 = new Thread(runnable);
                System.out.println("5th printing");
                d5.start();
                Thread d4 = new Thread(runnable);
                System.out.println("4th printing");
                d4.start();
                Thread d3 = new Thread(runnable);
                System.out.println("3th printing");
                d3.start();
                Thread d2 = new Thread(runnable);
                System.out.println("2nd printing");
                d2.start();
                Thread d1 = new Thread(runnable);
                System.out.println("1st printing");
                d1.start();
            }
            case 32 -> {
                thread=32;
                Thread d32 = new Thread(runnable);
                System.out.println("32th printing");
                d32.start();
                Thread d31 = new Thread(runnable);
                System.out.println("31th printing");
                d31.start();
                Thread d30 = new Thread(runnable);
                System.out.println("30th printing");
                d30.start();
                Thread d29 = new Thread(runnable);
                System.out.println("29th printing");
                d29.start();
                Thread d28 = new Thread(runnable);
                System.out.println("28th printing");
                d28.start();
                Thread d27 = new Thread(runnable);
                System.out.println("27th printing");
                d27.start();
                Thread d26 = new Thread(runnable);
                System.out.println("26th printing");
                d26.start();
                Thread d25 = new Thread(runnable);
                System.out.println("25th printing");
                d25.start();
                Thread d24 = new Thread(runnable);
                System.out.println("24th printing");
                d24.start();
                Thread d23 = new Thread(runnable);
                System.out.println("23th printing");
                d23.start();
                Thread d22 = new Thread(runnable);
                System.out.println("22th printing");
                d22.start();
                Thread d21 = new Thread(runnable);
                System.out.println("21th printing");
                d21.start();
                Thread d20 = new Thread(runnable);
                System.out.println("20th printing");
                d20.start();
                Thread d19 = new Thread(runnable);
                System.out.println("19th printing");
                d19.start();
                Thread d18 = new Thread(runnable);
                System.out.println("18th printing");
                d18.start();
                Thread d17 = new Thread(runnable);
                System.out.println("17th printing");
                d17.start();
                Thread d16 = new Thread(runnable);
                System.out.println("16th printing");
                d16.start();
                Thread d15 = new Thread(runnable);
                System.out.println("15th printing");
                d15.start();
                Thread d14 = new Thread(runnable);
                System.out.println("14th printing");
                d14.start();
                Thread d13 = new Thread(runnable);
                System.out.println("13th printing");
                d13.start();
                Thread d12 = new Thread(runnable);
                System.out.println("12th printing");
                d12.start();
                Thread d11 = new Thread(runnable);
                System.out.println("11th printing");
                d11.start();
                Thread d10 = new Thread(runnable);
                System.out.println("10th printing");
                d10.start();
                Thread d9 = new Thread(runnable);
                System.out.println("9th printing");
                d9.start();
                Thread d8 = new Thread(runnable);
                System.out.println("8th printing");
                d8.start();
                Thread d7 = new Thread(runnable);
                System.out.println("7th printing");
                d7.start();
                Thread d6 = new Thread(runnable);
                System.out.println("6th printing");
                d6.start();
                Thread d5 = new Thread(runnable);
                System.out.println("5th printing");
                d5.start();
                Thread d4 = new Thread(runnable);
                System.out.println("4th printing");
                d4.start();
                Thread d3 = new Thread(runnable);
                System.out.println("3th printing");
                d3.start();
                Thread d2 = new Thread(runnable);
                System.out.println("2nd printing");
                d2.start();
                Thread d1 = new Thread(runnable);
                System.out.println("1st printing");
                d1.start();
            }
        }
    }
}
