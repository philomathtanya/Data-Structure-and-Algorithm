import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int [n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=s.nextInt();

        }
        int find = 0;
        int tar=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    tar=arr[i];
                    find=j+1;

                    System.out.println("duplicate element "+tar+" find at "+find+" position");
                    break;
                }
            }
        }


    }
}
