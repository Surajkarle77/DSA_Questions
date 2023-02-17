class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int k=0;
        //first we put current element to their original place
        while(k<nums.length){
            int cur=nums[k]-1;
            if(nums[k]!=nums[cur]){
                swap(nums,k,cur);
            }
            else{
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                ans.add(nums[i]);
            }
        }
        return ans;
        
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
