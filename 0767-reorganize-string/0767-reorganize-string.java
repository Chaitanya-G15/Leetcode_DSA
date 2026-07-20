class Solution {
    public String reorganizeString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        StringBuilder ans = new StringBuilder();

        while (pq.size() > 1) {

            Map.Entry<Character, Integer> first = pq.poll();
            Map.Entry<Character, Integer> second = pq.poll();

            ans.append(first.getKey());
            ans.append(second.getKey());

            first.setValue(first.getValue() - 1);
            second.setValue(second.getValue() - 1);

            if (first.getValue() > 0)
                pq.offer(first);

            if (second.getValue() > 0)
                pq.offer(second);
        }

        // One character left
        if (!pq.isEmpty()) {

            Map.Entry<Character, Integer> last = pq.poll();

            if (last.getValue() > 1)
                return "";

            ans.append(last.getKey());
        }

        return ans.toString();
    }
}