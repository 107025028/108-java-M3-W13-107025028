import java.util.Scanner;

public class M3Q12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[e];
        int b[] = new int[x];
        int d[] = new int[e];
        int f[] = new int[e];
        int tcount=0;
        int t[]=new int[tcount];
        int con = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for (int j = 0; j < b.length; j++) {
            b[j] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j] == a[i]) {

                }



                }
            }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < b.length; j++) {
                        if (b[j] == a[i]) {
                            con++;
                            break;
                }
            }

        }
        System.out.print(con);
    }
}