
// Input :
// 5    -> Value of T
// [7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line 
// [1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line

import java.util.*;
public class maxguestsoncruise {
    public static void main(String[] args) {
        int t=5;
        int[] incoming={7,0,5,1,3};
        int[] outgoing={1,2,1,3,4};

        int maxGuests=Integer.MIN_VALUE;

        int curr=0;

        for(int i=0;i<t;i++){
            curr+=incoming[i];
            curr-=outgoing[i];
            maxGuests=Math.max(maxGuests,curr);
        }

        System.out.println("Maximum number of guests : "+maxGuests);
    }
}
