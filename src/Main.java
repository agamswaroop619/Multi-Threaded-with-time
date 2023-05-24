import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in= new Scanner(System.in);

        System.out.println("Main Program starts");
        Print m = new Print();
        System.out.println("Choose the no. of threads");
        System.out.println("1");
        System.out.println("2");
        System.out.println("4");
        System.out.println("8");
        System.out.println("16");
        System.out.println("32");
        int i=in.nextInt();
        m.printnumbers(i);
    }
}