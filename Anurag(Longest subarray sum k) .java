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
