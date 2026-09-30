import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;

        Arrays.sort(s);
        Arrays.sort(g);
       int p1=0;
        int p2=0;
        
      
       while(p1<g.length && p2<s.length){
        if(s[p2] >= g[p1]){
            p1++;
        }
        p2++;
       }
        return p1;
    }
}
