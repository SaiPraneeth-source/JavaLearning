class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
         int count = 0;
        for (int i = 0; i < nums.length; i++) {    
                if (nums[i] == 1) {
                    count++;
                }
                else{
               
                    temp = (temp > count) ? temp : count;;
                    count = 0;
                }
        }

    return (temp > count) ? temp : count;
       
       
    }
}