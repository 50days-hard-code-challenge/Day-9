// time complexity O(n^2)
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n=a.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            long sum=0;
            int count=0;
            int j=i;
            while(j<n && sum<=k)
            {
                sum=sum+a[j];
                count=count+1;
                if(sum==k)
                {
                    max=Math.max(count,max);
                }
                
                j++;
            }
        }
        return max;
    }
}
// using hashamp...........

import java.util.HashMap;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        HashMap<Long,Integer> map=new HashMap<>();
        int n=a.length;
        int max=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
          sum+=a[i];
          if(sum==k)
          {
              max=Math.max(max,i+1);
          }
          long key=sum-k;
          if(map.containsKey(key))
          {
              int length=i-map.get(key);
              max=Math.max(max,length);
          }
          if(!map.containsKey(sum))
          {
          map.put(sum,i);
          }
          
        }
        return max;
    }
}
