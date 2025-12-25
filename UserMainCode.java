import java.util.*;

public class UserMainCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        System.out.println(new UserMainCode().findPIN(a, b, c, d));
    }

    public int findPIN(int n1, int n2, int n3, int n4) {
        int evenSum = 0, oddSum = 0;
        for (int n : new int[]{n1, n2, n3}) {
            int pos = 1;
            while (n > 0) {
                int digit = n % 10;
                if (pos % 2 == 0) evenSum += digit; else oddSum += digit;
                n /= 10;
                pos++;
            }
        }
        return (n4 % 2 == 0) ? (evenSum - oddSum) : (oddSum - evenSum);
    }
}