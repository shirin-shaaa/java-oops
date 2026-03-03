import java.util.*;


class Prime extends Thread {
    int n;

    Prime(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Prime numbers within " + n + " are:");
        for (int i = 2; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}


class Table extends Thread {
    int n;

    Table(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Multiplication table of 5 until " + n + " is:");
        for (int i = 1; i <= n; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

public class thread {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for prime limit (n): ");
        int primeLimit = sc.nextInt();

        System.out.print("Enter value for table limit (n): ");
        int tableLimit = sc.nextInt();

        Prime t1 = new Prime(primeLimit);
        Table t2 = new Table(tableLimit);

        t1.start();
        t2.start();

        sc.close();
    }
}