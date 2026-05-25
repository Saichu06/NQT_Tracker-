import java.util.Arrays;

public class boatstosavepeople {
    public static void main(String[] args) {
        int[] people={12,3,4,5,6,1};
        int limit = 4;
         Arrays.sort(people);
        int boats=0;
        int n=people.length;
        int right=n-1;
        int left=0;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boats++;
        }

        // return boats;
    }
    }

