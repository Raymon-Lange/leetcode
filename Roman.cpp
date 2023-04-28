

#include <iostream>
#include <map>
#include <string>

    int romanToInt(std::string s) {

        std::map<std::string, int> my_map = {
                { "I", 1 },
                { "V", 5 },
                { "X", 10 },
                { "L", 50 },
                { "C", 100 },
                { "D", 500 },
                { "M", 1000 }};
    

        int num = 0;
        int left = 0;

        //Check to see if we have a just one roman value left and return its value
        if( s.size() == 1){
            return my_map[s];
        } 

        int firstChar = my_map[s.substr(0,1)];
        int secoundChar = my_map[s.substr(1,1)];

        if(firstChar == secoundChar)
        {
            num = firstChar + secoundChar;
        }

        if(firstChar > secoundChar)
        {
            if(s.size() > 2)
            {
                if(secoundChar < my_map[s.substr(2,1)])
                {
                    num = firstChar + (my_map[s.substr(2,1)] - secoundChar );
                    left = 1;
                }
                else
                {
                    num = firstChar + secoundChar;
                }
            }
            else
            {
                num = firstChar + secoundChar;
            }
            
        }

        if( firstChar < secoundChar)
        {   
            num = secoundChar- firstChar;
        }

        std::cout << num << "\n";

        if(s.size() != 2)
        {
            if (left == 1)
            {
                if(s.size() > 3)
                {
                    num += romanToInt(s.substr(3, s.size()-3));
                }
                else 
                {
                    return num;
                }
            }
            else
            {
                std::cout << s.substr(2, s.size()-2) << "\n";
                num += romanToInt(s.substr(2, s.size()-2));
            }
        }

        return num;
    }


    
int main() {
    int num = 0;

    num = romanToInt("M");
    std::cout << "Roman Value is  " << num << "\n";
    num = romanToInt("II");
    std::cout << "Roman Value is  " << num << "\n";
    num = romanToInt("VI");
    std::cout << "Roman Value is  " << num << "\n";
    num = romanToInt("IV");
    std::cout << "Roman Value is  " << num << "\n";

    num = romanToInt("III");
    std::cout << "Roman Value is  " << num << "\n";

    num = romanToInt("XXXIV");
    std::cout << "Roman Value is  " << num << "\n";

        num = romanToInt("MDCCCLXXXIV");
    std::cout << "Roman Value is  " << num << "\n";

    return 0;
}
