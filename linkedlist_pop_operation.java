import java.util.LinkedList;
  
public class linkedlist_pop_operation {
    public static void main(String[] args)
    {
  
        LinkedList<String> stack = new LinkedList<>();
  
     
        stack.push("tanya");
  
        stack.push("bansal");

        String s = stack.pop();
  
        System.out.println(s);
  
        stack.push("ritesh");
  
        System.out.println(stack);
    }
}
