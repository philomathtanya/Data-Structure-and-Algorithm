import java.util.Scanner;

public class Student_A {
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
        Scanner s=new Scanner(System.in);
        Student_A st []=new Student_A[3];
        for(int i=0;i<st.length;i++)
        {
            st[i]=new Student_A();
        }
        for(int i=0;i<st.length;i++)
        {
            st[i].setName(s.next());
            st[i].setRoll_no(s.nextInt());
            st[i].setMarks(s.nextInt());
        }
        int max=0;
        int min=st[0].marks;
        for(int i=0;i<st.length;i++)
        {
            if(st[i].marks>max)
            {
                max=st[i].marks;
            }
            if(st[i].marks<min)
            {
                min=st[i].marks;
            }
        }
        System.out.println("Minimum marks in 10 students"+min);
        System.out.println("Maximum marks in 10 student"+max);
}}
