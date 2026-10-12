package dbt.arrayandhashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopFrequentK {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i, 1);
        }

        List<Integer> list = map.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
