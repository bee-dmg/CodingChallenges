package BananaBoat;
import java.util.HashMap;
import java.lang.*;
import java.util.*; 
import java.util.concurrent.*; 
class Main {
  public static void main(String[] args) {
    String input = "Banana Boat.";
    input = input.replaceAll("[^a-zA-Z0-9]","");
     input = input.replaceAll(" ","");
 HashMap map = new HashMap();
    for(int i=0;i<input.length();i++){
      for(int j =i;j<input.length();j++){
        String snip = input.substring(i,j);
        
        if(map.get(snip)==null){
          map.put(snip,1);
        } else{
           int x =(Integer)map.get(snip);
          
         map.put(snip, x+1 );
         
      }
        
    }
   
  }
       TreeMap<String, Integer> sorted= new TreeMap<>();
      sorted.putAll(map);
    for(Object item : sorted.keySet()){
      String key = item.toString();
      int value = (Integer) sorted.get(item);
      System.out.println(key+":"+value);
      
    }
       
}
}