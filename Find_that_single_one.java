class Find_that_single_one {
    public int singleNumber(int[] nums) {
        
         for ( int i = 0; i < nums.length; i++){
            boolean isDuplicate = false;
            for( int j = 0; j < nums.length; j++){
                if(i != j) {
                if(nums[i] == nums[j]){
                    isDuplicate = true;
                    break;
                }
            }
            }
            if(!isDuplicate){
              return nums[i];
            }

         }
          return -1;
    }
   
}