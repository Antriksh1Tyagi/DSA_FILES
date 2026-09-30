class Solution {
    public boolean lemonadeChange(int[] bills) {
       int i = 0;
       int fives = 0;
       int tens = 0;
       boolean a = true;

        while(i < bills.length){
             if(bills[i] == 5){
                 fives += 1;
                 a = true;
             }
             else if(bills[i] == 10){
                if(fives >= 1){
                   a = true;
                   fives--;
                   tens++;
                }
                else{
                   a = false;
                   break;
                }
             }
             else if(bills[i] == 20){
                if(tens >= 1 && fives >= 1){
                   a = true;
                   tens--;
                   fives--;
                }
                else if(fives >= 3){
                    a = true;
                    fives -= 3;
                }
                else{
                   a = false;
                   break;
                }
             }
             i++;
        } 
        
        return a; 
    }
}