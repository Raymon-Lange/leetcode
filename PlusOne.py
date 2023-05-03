class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 1
        index = len(digits) -1
        for x in reversed(digits):
            temp = x + carry
            carry = 0
            
            digits[index] = temp % 10
            index = index - 1
            
            if(temp >= 10):
                carry = 1
                
            
        if(carry == 1):
            digits.insert(0, 1)
        
        return digits
