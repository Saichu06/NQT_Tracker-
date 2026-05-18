import java.util.*;

public class findminarrow {
    public static void main(String[] args) {
        int count=0;
        int arrow=0;
        int[][] points = {
            {10,16},{2,8},{1,6},{7,12}
        };
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));

        for(int i=0;i<points.length;i++){
            if(count==0 || points[i][0]>arrow){
                count++;
                arrow=points[i][1];
            }
        }

        System.out.println("Minimum arrow to shoot : "+ count);
    }
}
