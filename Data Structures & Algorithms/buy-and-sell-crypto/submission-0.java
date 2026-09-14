class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int p : prices){
            min = Math.min(min, p);

            int pro = p - min;
            max = Math.max(max, pro);
        }

        return max;
    }
}
