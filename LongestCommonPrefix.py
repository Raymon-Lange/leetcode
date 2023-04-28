class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        answer = ""
        firstword = min(strs,key=len)
        index = 0
        for i in firstword:
            for j in strs:
                if firstword[index] != j[index]:
                    return answer
            answer += firstword[index]
            index += 1
        return answer
