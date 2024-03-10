// Ders İçi Etkinlik
// 09.03.2024 Pair 6 - Soru 1

public class Main {
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;
        System.out.println(isFriendNumbers(num1, num2));
    }

    public static boolean isFriendNumbers(int num1, int num2) {
        int num1Total = 0;
        int num2Total = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                num1Total += i;
            }
        }
        for (int j = 1; j < num2; j++) {
            if (num2 % j == 0) {
                num2Total += j;
            }
        }
        if (num1Total == num2 && num2Total == num1) return true;
        else return false;
    }
}