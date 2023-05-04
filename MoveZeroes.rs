impl Solution {
  
    pub fn move_zeroes(nums: &mut Vec<i32>) {
        let mut counter = 0;
        let mut i = 0; 
        while i <(nums.len()){
            
            if(nums[i] == 0 as i32 ){
                nums.remove(i);
                i=i-1;
                counter=counter+1;
            }
            i= i+1;
        }
        for x in 1..counter+1{
            nums.push(0);
        }
     
    }
}
