import java.util.*;

class countelementswithMaxFreq{
    static int[] nums = {1,2,2,3,1,4};
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int frequency=0;
        int count=0;
        for(int val:map.values()){
            if(frequency==val){
                count++;
            }
            else if(val>frequency){
                count=1;
                frequency=val;
            }
        }
        System.out.println("Count value : " + frequency*count);
    }
}