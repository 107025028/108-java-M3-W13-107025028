import java.util.Random;
import java.util.Scanner;

public class M3Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random re = new Random();
        re.setSeed(23323456);
        int da[] = new int[6];
        boolean a = true;
        int i = 0;
        while (i < 6) {
            a = true;
            da[i] = re.nextInt(42) + 1;
            for (int j = 0; j < i; j++) 
            {
                if (da[j] == da[i]) 
                {
                    a = false;
                    break;
                }
              

                } 
            if (a == true) 
            {
                    System.out.print(da[i]);
                    i++;

            }
                }  
       
    }
}
