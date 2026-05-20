import java.util.*;

class Solution {
    public int secondmostrepeatedstring(String[] arr) {
        
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int first = 0, second = 0;

        // Find highest and second highest frequency
        for (int freq : map.values()) {
            if (freq > first) {
                second = first;
                first = freq;
            } else if (freq > second && freq != first) {
                second = freq;
            }
        }

        // Find string having second highest frequency
        // for (String key : map.keySet()) {
        //     if (map.get(key) == second) {
        //         return key;
        //     }
        // }

        return second;
    }
}