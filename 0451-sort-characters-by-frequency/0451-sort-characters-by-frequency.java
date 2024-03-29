class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        maxHeap.addAll(charFreq.entrySet());

        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}