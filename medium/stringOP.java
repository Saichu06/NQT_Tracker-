import java.util.*;

class stringOP {
    public static void main(String[] args) {
        String s = "AABBBCCCDD";
        int N = 10;
        Map<Character, Integer> charMap = new HashMap<>();
        // Strong frequencies
        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        // Freq of frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (char key : charMap.keySet()) {
            int freq = charMap.get(key);
            freqMap.put(freq, freqMap.getOrDefault(freq, 0) + 1);
        }

        // Max Frequency
        int max = Integer.MIN_VALUE;
        for (int key : freqMap.keySet()) {
            max = Math.max(freqMap.get(key), max);
        }

        // find the final frequency
        int ans = Integer.MAX_VALUE;

        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) == max) {
                ans = Math.min(ans, key);
            }
        }

        System.out.println("Max Frequency is : " + ans);
    }
}