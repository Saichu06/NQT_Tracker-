import java.util.*;
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        char[] str=s.toCharArray();
        int moves=0;
        for(char bracket : str){
            if(bracket=='('){
                st.push(bracket);
            }
            else{
                if(st.isEmpty()){
                    moves++;
                }
                else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            moves++;
            st.pop();
        }

        return moves;
    }
}