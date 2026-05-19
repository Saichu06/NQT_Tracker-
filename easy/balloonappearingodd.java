import java.util.*;

class balloonappearingodd{
    public static void main(String[] args){
        char[] balloon = {'a', 'b', 'b', 'b', 'c', 'c', 'c', 'a', 'f', 'c'};
        
        // Step 1: Create a HashMap to store the frequency of each character
        Map<Character, Integer> counts = new HashMap<>();
        
        for (char b : balloon) {
            counts.put(b, counts.getOrDefault(b, 0) + 1);
        }

        boolean isFound=false;
        for(int key : counts.keySet()){
            if(counts.get(key)%2==1){
                System.out.println("Balloon having odd count : "+key);
                isFound=true;
                break;
            }
        }

        if(isFound==false){
            System.out.println("Not found any odd count balloons!");
        }
    }
}