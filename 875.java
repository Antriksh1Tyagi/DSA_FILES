import java.util.*;


class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        Arrays.sort(piles);

        int l=1;
         int r = piles[piles.length - 1];
        int sum=0;
        int sol=0;
    
      


        while(l<=r){

          int mid = l + (r - l) / 2;

     long actualHours=0;

          for(int pile:piles){

            actualHours += (pile + mid - 1) / mid; 
          

          }

        

            if(actualHours>h){
              
                l=mid+1;


                
            }

            else if(actualHours<=h){
                sol=mid;
                r=mid-1;

           


            }
          }
           


            
       return sol; }



}