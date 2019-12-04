public class M3Q9 {
    public static void main(String args[]){
        int da[]={3,9,4,2,5};
        for (int i=0;i<da.length;i++){
            for (int j=i+1;j<da.length;j++){
                if (da[i]>da[j]){
                    int t=da[i];
                    da[i]=da[j];
                    da[j]=t;
                }
            }
            System.out.print(da[i]+"\t");
        }
    }
}
