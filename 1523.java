class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int dif=high-low;
        if (dif%2!=0){
            dif-=1;
        }
        count=(high-low)/2;
        if(low%2!=0 || (high%2!=0)){
            count+=1;
        }
        return count;}}
