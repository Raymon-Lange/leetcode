class Solution:
    def firstUniqChar(self, s: str) -> int:
       #STEP: build hash map 
        count = collections.Counter(s)
        
        #STEP:  find the index
        for idx, ch in enumerate(s):
            if count[ch] == 1:
                return idx     
        return -1
