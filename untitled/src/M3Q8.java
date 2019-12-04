import java.util.Scanner;

public class M3Q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        String ar[]=in.split(" ");
        int v=0;
        for (int i=0;i<ar.length;i++){
            v=Integer.parseInt(ar[i]);
            System.out.print(v*v+"\n");
        }
    }
}
