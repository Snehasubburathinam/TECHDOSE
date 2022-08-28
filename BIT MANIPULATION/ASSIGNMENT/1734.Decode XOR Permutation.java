class Solution {
    public int[] decode(int[] encoded) {
        int[] res = new int[encoded.length+1];
        int perm = 0;
        for(int i = 1; i <= encoded.length+1; i ++)
            perm ^= i;
        for(int i = 1; i < encoded.length; i += 2)
            perm ^= encoded[i];
        res[0] = perm;
        for(int i = 1; i < res.length; i ++) {
            res[i] = res[i-1] ^ encoded[i-1];
        }
        return res;
    }
}
