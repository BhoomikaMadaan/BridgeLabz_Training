import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(Word);
        }
        System.out.println(map.values());

    }

}