import java.util.Scanner;

public class game_entry {
    
    private int score;
        private String name;
        public game_entry(int score, String name) {
                this.score = score;
                this.name = name;
        }

        public int getScore() {
                return score;
        }
        public String getName() {
                return name;
        }

        @Override
        public String toString() {
                return "("+score + ", "+ name+ ")";
        }
}
class main{
        public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
               int n=s.nextInt();
                game_entry arr[]=new game_entry[n];
                int b = 0;
               for(int i=0;i<n;i++)
               {
                       arr[i]=new game_entry(s.nextInt(),s.next());
               }
               int max=0;
               for(int i=0;i<n;i++) {
                   if (arr[i].getScore() > max) {
                       max = arr[i].getScore();
                        b=i;
                   }
               }
            System.out.println(arr[b].toString());
        }
}
