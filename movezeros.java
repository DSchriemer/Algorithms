class template {

  //given an array of numbers, move all zeros to the end of the array and maintain the order
  //[1,0,9,0] --> [1,9,0,0]


  public static String method(int[] nums) {

    int index = 0;
    for(int i =0; i < nums.length;i++){

      if(nums[i] != 0)
      {
        nums[index] = nums[i];
        index++;
      }
    }

    for(int i = index; i<nums.length;i++)
    {
      nums[i] = 0;
    }

    return nums;

  }
}
