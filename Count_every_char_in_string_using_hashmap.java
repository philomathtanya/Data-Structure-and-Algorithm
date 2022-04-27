import java.util.HashMap;

public class Count_every_char_in_string_using_hashmap {
    public static void main(String[] args) {
        String s="ritesh verma" ;
        HashMap<Character,Integer> fmap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(fmap.containsKey(ch))
            {
                fmap.put(ch,fmap.get(ch)+1);
            }
            else {
                fmap.put(ch,1);
            }
        }

        System.out.println(fmap);
    }
}
