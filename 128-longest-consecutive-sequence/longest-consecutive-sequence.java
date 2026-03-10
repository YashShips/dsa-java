class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlen = 0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)
        {
            hs.add(i);
        }
        for(int i:hs)
        {
            if(!hs.contains(i-1))
            {
                int currlen=1;
                int curr=i;
                while(hs.contains(curr+1))
                {
                    curr++;
                    currlen++;
                }
            
            maxlen=Math.max(maxlen,currlen);
            }
        }
        return maxlen;
    }
}