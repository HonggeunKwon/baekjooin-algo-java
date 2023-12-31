import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++) {
            int count = map.getOrDefault(participant[i], 0);
            map.put(participant[i], count + 1);
        }
        
        for(int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) - 1);
            
            if(map.get(completion[i]) == 0) {
                map.remove(completion[i]);
            }
        }
        
        for(String str : map.keySet()) {
            return str;
        }
        return null;
    }
}