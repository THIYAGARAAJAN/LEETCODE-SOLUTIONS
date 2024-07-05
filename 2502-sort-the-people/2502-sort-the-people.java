import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> hm = new HashMap<>();
        
        // Populate the hashmap with heights as keys and names as values
        for (int i = 0; i < names.length; i++) {
            hm.put(heights[i], names[i]);
        }
        
        // Sort the heights array
        Arrays.sort(heights);
        
        // Create the result array
        String[] arr = new String[names.length];
        
        // Populate the result array based on sorted heights
        for (int i = names.length - 1; i >= 0; i--) {
            arr[names.length - 1 - i] = hm.get(heights[i]);
        }
        
        return arr;
    }
}
