import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
for (int s : nums) {
    freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
}
    int Maxfr =0;

    for(int freq:freqMap.values()){
        Maxfr =Math.max(Maxfr,freq);

    }

    int totalMaxFreqElements = 0;
        for (int freq : freqMap.values()) {
            if (freq == Maxfr) {
                totalMaxFreqElements += Maxfr; 
            }
        }


return totalMaxFreqElements;
}}
