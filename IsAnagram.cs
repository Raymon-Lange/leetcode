public class Solution {
    public bool IsAnagram(string s, string t) {
        //STEP : Why are we here if they are not equal 
        if(s.Length != t.Length) return false;
        
        
        List<char> charS = new List<char>();
        charS.AddRange(s);
        
        List<char> charT = new List<char>();
        charT.AddRange(t);
        //STEP: Each letter check if contains 
        for(int i = 0; i < charS.Count(); i++) {
            if(charT.Contains(charS[i]))
                charT.Remove(charS[i]);
            else
                return false;
        }

        return true;
    }
}
