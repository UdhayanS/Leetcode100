class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        int i = 0;
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                char find = c;
                for (char ch : s.toCharArray()) {
                    if (ch == find)
                        return i;
                    i++;
                }
            }
        }

        return -1;
    }
}