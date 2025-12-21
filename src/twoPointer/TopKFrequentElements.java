package twoPointer;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

//347: https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKFrequentElements {
    // we can use priority queue or MIN HEAP;

    // WE can use hashmap and bucket array with index as frequency;



    private static int[] fun(int[] nums,int k){
        int [] res = new int[k];
        Map<Integer, Integer> fre = new HashMap<>();
        for (int i : nums) {
            fre.put(i, fre.getOrDefault(i, 0) + 1);
        }

        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> fre.get(a) - fre.get(b));

        for (int key : fre.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (k-- >= 0) {
            res[k] = minHeap.poll();
        }
        return res;
    }
    public static void  main(String[] args) {
        

    }
}
