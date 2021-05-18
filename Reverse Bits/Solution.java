public class Solution {
    public long reverse(long a) {
        long b = 0L;
        for(int i = 31; i >=0; i--){
            if((a & 1L<<i) != 0){
                b = b | 1L<<(31-i);
            }
        }
        return b;
    }
}

