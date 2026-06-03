class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        String temp = "";
        generateCombination(0,0,n,temp ,result);
        return result;
    }
    public void generateCombination(int open, int close, int n , String tmp , List<String> result){
        if(open == n && close == n){
            result.add(tmp);
        }
        if(open < n ){
            generateCombination(open+1 , close , n , tmp+"(" , result);
        }
        if(close < open ){
            generateCombination(open , close + 1 , n , tmp+")" , result);
        }
    }

}
