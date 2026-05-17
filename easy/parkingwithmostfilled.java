import java.util.*;
class parkingwithmostfilled{
    public static void main(String[] args){
        int[][] mat = {
            {0,1,0},{1,1,0},{1,0,0}
        };

        int row=0;
        int count=0;

        int m=mat.length;
        int n=mat[0].length;

        for(int i=0;i<n;i++){
            if(mat[0][i]==1){
                count++;
            }
        }

        for(int i=1;i<m;i++){
            int currMax=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    currMax++;
                }
            }
            if(currMax>count){
                count=currMax;
                row=i;
            }
        }

        System.out.println("Row and column with most count of 1 : " + new int[]{row,count});

        // return new int[]{row,count};
    }
}