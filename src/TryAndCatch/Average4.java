package TryAndCatch;

import java.io.IOException;
import java.util.Scanner;

public class Average4 {

    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        int number;
        while(true) {
            number = nextInt();
            if(number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.printf("平均 %.2f%n", sum / count);
        
        try {
            System.in.read();
        } catch(IOException | ClassCastException e) {
            e.printStackTrace();
        } 
    }

    static Scanner scanner = new Scanner(System.in);

    static int nextInt() {
        String input = scanner.next();
        while(!input.matches("\\d*")) {
            System.out.println("請輸入數字");
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }
}