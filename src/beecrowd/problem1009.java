import java.util.Scanner;

public class Problem1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        System.out.printf("TOTAL = R$ %.2f%n", s.nextDouble()+s.nextDouble()*0.15);
    }
}