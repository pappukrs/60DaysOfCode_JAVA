
import java.util.HashMap;
class HashmapExample{
    public static void main(String args[]){
            HashMap<String,Integer> hash =     new HashMap<>();
              hash.put("Alka", 1);
              hash.put("Sharma",43);
            System.out.println("hash"+hash);
           System.out.println(hash.get("Alka")); 
           System.out.println(hash.replace("Alka",11)); 
           System.out.println("hash"+hash);
    }
}