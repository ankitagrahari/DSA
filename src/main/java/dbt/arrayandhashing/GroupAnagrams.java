package dbt.arrayandhashing;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0) return Collections.emptyList();
        for(String s : strs){
            String key = createKey(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        System.out.println(map);
        return new ArrayList<>(map.values());
    }

    private String createKey(String s){
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int count : arr) {
            sb.append(count).append("#");
        }

        return sb.toString();
    }
}
