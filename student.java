import java.util.Scanner;

public class student {
    private String name;
    private int roll_no;
    private int marks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        student arr[] = new student[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new student();
            arr[i].setName(s.next());
            arr[i].setMarks(s.nextInt());
            arr[i].setRoll_no(s.nextInt());
        }
        //2.5.6.1
        int t = 0;
        int max = arr[0].marks;
        for (int i = 0; i < 10; i++) {
            if (max < arr[i].marks) {
                   t=max;
                   max = arr[i].marks;
               }
        }
        System.out.println(t);
    }
}
