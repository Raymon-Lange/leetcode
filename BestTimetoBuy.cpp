class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int maxProfit = 0;
        bool holding = false;
        int pruchasePrice = 0;
        
        for(int i = 1; i < prices.size(); i++)
        {
            //STEP: Buy 
            if(prices[i-1] < prices[i])
            {
                if(!holding){
                    pruchasePrice = prices[i-1];
                    holding = true;
                }
            }
            
            //STEP:Sell
            if(prices[i-1] < prices[i]){
                if(holding){
                    maxProfit +=  prices[i] - pruchasePrice;
                    holding = false;
                }
            }       
        }
        
        if(holding)
            maxProfit +=  prices[prices.size()] - pruchasePrice;
        
        return maxProfit;
        
    }
};
