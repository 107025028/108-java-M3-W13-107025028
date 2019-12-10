import java.util.Scanner;

public class M3Q10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int z[] = new int[a];
        int max = 0;

        for (int i = 0; i < z.length; i++) {
            z[i] = sc.nextInt();

        }
        max = z[0] * z[1];
        for (int i = 0; i < z.length; i++) {

            if (max <= (z[i] * z[i]))
                max = (z[i - 1] * z[i]);

        }
        System.out.print(max);
    }
}