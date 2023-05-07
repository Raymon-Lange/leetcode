impl Solution {
    pub fn reverse(x: i32) -> i32 {
        
        //STEP: Check for negative number
        let mut negative = false;
        if x < 0 {
            negative = true;
        }
        //STEP: ABS the value
        let s = x.abs().to_string();
        
        //STEP: rev the string 
        let answer: String = s
            .chars()
            .rev()
            .collect();
        
        //STEP: if answer can't be parse to i32 because it large return zero
        return match answer.parse::<i32>() {
            Ok(n) => if negative { -n } else { n },
            Err(_) => 0,
        };
    }
}
