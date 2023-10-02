class Solution {
    private:
   string removeSpaces(string s) {
        int n = s.size();
        int i = 0, j = 0;
        while (j < n) {
            if (s[j] != ' ' || (j != 0 && s[j - 1] != ' ')) {
                s[i] = s[j];
                i++;
            }
            j++;
        }
        if (s[i - 1] == ' ')
            i--;
        return s.substr(0, i);
    }
public:
    string reverseWords(string s) {
    
        int start = 0;
        int i = 0;
        int n = s.size();
        while (i < n) {
            if (s[i] != ' ') {
                i++;
            } else {
                reverse(s.begin() + start, s.begin() + i);
                start = i + 1;
                i++;
            }
        }
        
        if (start < n) {
            reverse(s.begin() + start, s.end());
        }
        
        reverse(s.begin(), s.end());
         return removeSpaces(s);
    }
};
