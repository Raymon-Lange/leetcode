impl Solution {
    pub fn my_atoi(s: String) -> i32 {
        
        let mut answer = String::from("");
        let mut negative = false;
        let mut foundSign = false;
        
        for c in s.trim().chars() {
            
             if c == '-' {
                 
                if(answer.len() >0){
                    break;
                }
                 
                if !foundSign {
                    negative = true;
                    foundSign = true;
                } else { 
                    break;
                }
                
            } else if c == '+' {
                if(answer.len() >0){
                    break;
                }
                
                if !foundSign {
                    negative = false;
                    foundSign = true;
                } else { 
                    break;
                }         

            } else if c.is_numeric() {
                answer.push(c);
            } else if !c.is_numeric(){
                break;
            }
        }
        
        if answer.len() == 0 { 
            return 0;
        }
        
        //STEP: if answer can't be parse to i32 return { i32::MIN } else { i32::MAX-1 }
        return match answer.parse::<i32>() {
            Ok(n) => if negative { -n } else { n },
            Err(_) => if negative { i32::MIN } else { i32::MAX },
        };
        
    }
}
