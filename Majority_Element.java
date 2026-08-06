class Majority_Element {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for ( int i = 0; i < nums.length; i++){
            int number = 0;
            for (int j = 0; j < nums.length; j++){
                if ( nums[i] == nums[j]){
                    number++;
                }
                if (number > n/2)
                    return nums[i];
            }
        }
        return 0;
    }
}