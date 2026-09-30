class Solution {
    public int romanToInt(String s) {
        int a = 0;

        for (int i = 0; i < s.length(); i++) {
         
            int current = 0;
            if (s.charAt(i) == 'I') 
            current = 1;
            if (s.charAt(i) == 'V')
             current = 5;
            if (s.charAt(i) == 'X') 
            current = 10;
            if (s.charAt(i) == 'L') 
            current = 50;
            if (s.charAt(i) == 'C') 
            current = 100;
            if (s.charAt(i) == 'D') 
            current = 500;
            if (s.charAt(i) == 'M') 
            current = 1000;

          
            int next = 0;
            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                if (nextChar == 'I') 
                next = 1;
                if (nextChar == 'V')
                 next = 5;
                if (nextChar == 'X')
                 next = 10;
                if (nextChar == 'L')
                 next = 50;
                if (nextChar == 'C')
                 next = 100;
                if (nextChar == 'D')
                 next = 500;
                if (nextChar == 'M')
                 next = 1000;
            }
            if (current < next) {
                a -= current;
            } else {
                a += current; 
            }
        }
        
        return a; 
    }
}

