public class Solution {
    public int numSetBits(long a) {
        int count=0;
        while(a!=0){
            count++;
           a= a & a-1;
        }
        return count;
    }
}

