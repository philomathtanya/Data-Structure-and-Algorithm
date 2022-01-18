import java.util.Scanner;

/*Q. Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].

Example

Imagine the size of both the arrays are 5

myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,2
*/
public class Raman_problem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        System.out.println("Enter the number rof element in array 1: ");
        int a=s.nextInt();
        int arr1[]=new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the number of elements in array 2: ");
        int b=s.nextInt();
        int arr2[]=new int[b];
        for (int i = 0; i < b; i++) {
            arr2[i]=s.nextInt();
        }
        System.out.println("Elements in myarr1[] elements greater than or equal to myarr2[]: ");
        for (int i = 0; i <a ; i++) {
            int c=0;
            for (int j = 0; j < b; j++) {
                if (arr1[i]<=arr2[j])
                {
                    c++;
                }
            }
            System.out.print(c+" ");
        }
    }
}
