import java.util.Scanner;

public class M3Q1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char daty[]=s.nextLine().toCharArray();
        for (int i=daty.length-1;i>=0;i--){
            System.out.print(daty[i]);
        }
    }
}
