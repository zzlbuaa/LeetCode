class Solution {
    public List<List<Integer>> results = new ArrayList<>();
    public int size;
    
    public List<List<Integer>> permute(int[] nums) {
        size = nums.length;
        permute(nums, 0);
        return results;
    }
    
    public void permute(int[] nums, int start) {
        if(start == size-1) {
            rotate(nums, start);
            results.add(Arrays.stream( nums ).boxed().collect(Collectors.toList()));
            //rotate(nums, start);
        }
        for(int i=0; i<size-start; i++) {
            rotate(nums, start);
            permute(nums, start+1);
        }
    }
    
    public void rotate(int[] nums, int start) {
        int tmp = nums[size-1];
        for(int i=size-1; i>start; i--) {
            nums[i] = nums[i-1];
        }
        nums[start] = tmp;
    }
}
