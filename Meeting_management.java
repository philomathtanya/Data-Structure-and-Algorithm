import java.util.Scanner;

public class Meeting_management {

        int start;
        int end;
        public boolean canAttendMeeting(Meeting_management[] arr) {
            int p=1021;
            for (int i = 0; i < arr.length; i++) {
                if(p==0)
                    break;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i].end <= arr[j].start)
                    p=1;
                    else
                    {
                        p=0;
                    break;
                }}
            }
            if(p==1)
            return true;
            else
                return false;
        }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
class main_time
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of meetings: ");
        int n=s.nextInt();
        Meeting_management obj=new Meeting_management();
        Meeting_management arr[]=new Meeting_management[n];
        for (int i = 0; i < n; i++) {

            arr[i]=new Meeting_management();
            System.out.println("Enter the Starting time (24 h format): ");
            obj.start=s.nextInt();
            System.out.println("Enter the Ending time (24h Format): ");
            obj.end=s.nextInt();
            arr[i].setStart(obj.start);
            arr[i].setEnd(obj.end);
        }
        System.out.println("Possibility: "+obj.canAttendMeeting(arr));



    }
}
