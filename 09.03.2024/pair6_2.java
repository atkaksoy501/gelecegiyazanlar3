// Ders İçi Etkinlik
// 09.03.2024 Pair 6 - Soru 2

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        isSuperNumbers();
    }

    public static void isSuperNumbers() {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j< i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                list.add(i);
            }
            sum = 0;
        }
        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }
}