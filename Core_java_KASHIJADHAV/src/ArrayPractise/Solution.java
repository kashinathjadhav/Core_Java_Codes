package ArrayPractise;

import java.util.ArrayList;

class Solution{

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int first = 0;
        int last = 0;

        long result = arr[first];
        ArrayList<Integer> res = new ArrayList<Integer>();
        while (result != s) {
            if (result > s) {
                if (first == last) {
                    last++;
                    first++;
                    if (last >= n) break;
                    result = arr[first];
                } else {
                    result -= arr[first];
                    first++;
                }
            } else {
                last++;
                if (last < n) {
                    result += arr[last];
                } else {
                    break;
                }
            }
        }

        if (result != s) {
            res.add(-1);
        } else {
            res.add(first + 1);
            res.add(last + 1);
            
        }
        return res;    
    }
}