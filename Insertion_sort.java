import java.sql.SQLOutput;

public class Insertion_sort {
void isort(int arr[])
{
    for (int i = 1; i <arr.length; i++) {
        int temp=arr[i];
        int a=i-1;
        while(a>-1 && (arr[a]>temp))
        {
            arr[a+1]=arr[a];
            a--;
        }
        arr[a+1]=temp;
    }
}
void display(int arr[])
{
    System.out.println("Array is: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}

    public static void main(String[] args) {
        int arr[]={8,7,6,5,4};
        Insertion_sort obj=new Insertion_sort();
        obj.display(arr);
        obj.isort(arr);
        obj.display(arr);
    }
}
