class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int count=1;
            if(set.contains(nums[i]-1)){
                continue;
            }else{
                int n=nums[i];
                while(set.contains(n+1)){
                    count++;
                    n=n+1;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
