class Solution {
    public boolean checkIfPangram(String sentence) {
       Set<Character> s=new HashSet();
        for(char c:sentence.toCharArray()){
            s.add(c);
        }
        if(s.size()==26){
            return true;
        }
        return false;
    }
}
