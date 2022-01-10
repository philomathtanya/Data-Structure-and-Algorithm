
import java.util.Scanner;

public class Company{

int product[]=new int[3];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Company arr[]=new Company[5];
       // int product[]=new int [3];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=new Company();}
        int sum[]=new int[5];
        int su[]=new int[3];
        for(int i=0;i< arr.length;i++) {
            System.out.println("please enter salesmen" + (i + 1) + "produts =");

            for(int j=0;j<3;j++) {


                arr[i].product[j] = s.nextInt();

            sum[i]+=arr[i].product[j];
            su[j]+=arr[i].product[j];

        }}
        for(int i=0;i< sum.length;i++)
        {
            System.out.println("the sum of saleman"+(i+1)+"="+sum[i]);
        }
        for(int i=0;i< su.length;i++)
        {
            System.out.println("the total of product"+(i+1)+"="+su[i]);
        }
    }

}
