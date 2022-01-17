import java.util.Scanner;

public class Flower {
    String name;
    int petals;
    float price;
    Flower(String name,int petals,float price)
    {
        this.name=name;
        this.petals=petals;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
class Main1{
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
        Flower arr[]=new Flower[n];
        for (int i = 0;  i<n ; i++) {
            arr[i]=new Flower(s.next(),s.nextInt(),s.nextFloat());
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getPetals());
            System.out.println(arr[i].getPrice());
        }
    }
}
