package threads;

/**
 *
 * @author hp
 */
public class Threads {

    public static void main(String[] args) {
        
        PrintChar printA = new PrintChar('a', 100);
        PrintChar printB = new PrintChar('b', 100);
        PrintNum print100 = new PrintNum(100);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        
        thread1.start();
        thread2.start();
        thread3.start();

    }

}

//Task to print a character
class PrintChar implements Runnable {

    private char charToPrint;
    private int times;

    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(charToPrint);
        }
    }
}

//Task to print numbers
class PrintNum implements Runnable {

    private int lastNum;

    public PrintNum(int n) {
        lastNum = n;
    }

    public void run() {
        for (int i = 0; i < lastNum; i++) {
            System.out.println("" + i);
        }
    }
}
