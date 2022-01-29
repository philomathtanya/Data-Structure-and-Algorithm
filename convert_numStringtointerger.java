import java.util.Scanner;

public class convert_numStringtointerger {
    public static int a=0;
    public static int convert(char arr[],int ans)
    {
        if(a<=arr.length-1)
        {
            ans=ans+Integer.parseInt(Character.toString(arr[a]));
            ans*=10;
            a++;
            return convert(arr,ans);
        }
        else
            return ans/10;
    }
    public static void main(String[] args) {
        String st;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number (STRING) :-");
        st=s.next();
        char arr[]=new char[st.length()];
        for (int i = 0; i <st.length() ; i++) {
            arr[i]=st.charAt(i);
        }
        int ans=0;
        System.out.println("Integer number :- ");
        System.out.println(convert(arr,ans));



    }
}
