/*
 * 692. Top K Frequent Words
 * Given an array of strings words and an integer k, return the k most frequent strings.
 * Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order. 
*/

import java.util.*;

class topKFrequentWordsOctober19 {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> count = new HashMap<>();
        for(String word : words) {
            if(count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            }
            else {
                count.put(word, 1);
            }
        }
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int f1 = count.get(word1);
                int f2 = count.get(word2);
                if(f1 == f2) {
                    return word2.compareTo(word1);
                }
                return f1 - f2;
            }
        });
        for(Map.Entry<String, Integer> entry: count.entrySet()) {
            pq.add(entry.getKey());
            if(pq.size() > k) pq.poll();
        }
        ArrayList<String> ans = new ArrayList<String>();
        while(!pq.isEmpty()) {
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}