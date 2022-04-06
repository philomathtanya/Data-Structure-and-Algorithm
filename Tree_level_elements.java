import java.util.Scanner;

public class Tree_level_elements {
    public static double level(int l)
    {
        int n=2;
        return Math.pow(n,l);
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int l;
        int op;
        System.out.println("What you want to calculate for tree:-");
        System.out.println("1.Elements at some level.");
        System.out.println("2 Total elements in a tree: ");
        System.out.println("3.Total elements in a tree except leaf nodes.");
        op=s.nextInt();
        switch (op)
        {
            case 1:
            {
                System.out.println("Enter the level: ");
                l=s.nextInt();
                System.out.println("Total number of element at the given level: "+(int)level(l));
                break;
            }
            case 2:
            {
                System.out.println("Enter the height of the tree: ");
                int h=s.nextInt();
                System.out.println("Total number of elements:"+ ((int)Math.pow(2,h)-1 ));
                break;
            }
            case 3:
            {
                System.out.println("Enter the height of the tree: ");
                int h=s.nextInt();
                System.out.println("Total number of elements:"+ (((int)Math.pow(2,h)-1 )-(int)Math.pow(2,h-1)));
                break;
            }
        }



    }
}
