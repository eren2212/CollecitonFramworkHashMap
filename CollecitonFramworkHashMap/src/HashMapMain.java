
import java.util.HashMap;
import java.util.Map;


public class HashMapMain {
    public static void main(String[] args) {
        /*
        1.değerleri Key(anahtar) ve Value(değer) olarak depolar.
            
        */
        
        HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
        
        hashmap.put(10, "Java");
        hashmap.put(30, "Python");
        hashmap.put(50, "Php");
        hashmap.put(20, "Php");
        hashmap.put(20, "Php");
        
        hashmap.put(20, "Javascript");
        
        System.out.println(hashmap);
        
        /*System.out.println(hashmap.get(10));
        System.out.println(hashmap.get(100));//NULL değer döndürür.*/
        
        for(Map.Entry<Integer,String> entry: hashmap.entrySet()){
            System.out.println("Anahtar : "+entry.getKey()+"-------->"+"Değer : "+entry.getValue());
        }
        
        
    }
}
