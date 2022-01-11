/*Q. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects.
 Now write a program to
 (a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.
(c) find the number of students who have scored below 50 in their average.
(d) display the scores obtained by every student.

*/
import java.util.Scanner;

public class subject {
    public static void main(String[] args) {
        int arr[][]=new int [4][5];
        Scanner s= new Scanner(System.in);
        int avs[]=new int [4];
        int ave[]=new int [5];
        int avss[]=new int [4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
            arr[i][j]= s.nextInt();
                avs[i]+=arr[i][j];

            ave[j]=(ave[j])+((arr[i][j]));
                avss[i]=(avss[i])+((arr[i][j]));
        }}
        for(int i=0;i<4;i++)
        {
            System.out.println("the average of student "+(i+1)+" "+avs[i]/5);
        }
        for(int j=0;j<5;j++)
        {
            System.out.println("the average of each subject"+(j+1)+" "+ave[j]/4);
        }
        for(int i=0;i<4;i++)
        {
            if(avs[i]<50)
            {
                System.out.println("the number "+(i+1)+" student scored below 50");
            }
        }
        for(int i=0;i<4;i++)
        {
            System.out.println("the total scores obtained by "+(i+1)+" student is "+avss[i]);
        }






        }
}
