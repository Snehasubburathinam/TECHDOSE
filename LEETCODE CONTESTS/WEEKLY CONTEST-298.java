class Solution {
    public String greatestLetter(String s) {
       var letters = new HashSet<Character>();
	     for(var i=0;i<s.length();i++){
		      letters.add(s.charAt(i));
       }
	     for(var ch='Z';ch>='A';ch--){
		     if(letters.contains(ch) && letters.contains(Character.toLowerCase(ch))){
		    	  return Character.toString(ch);
         }
      }
    	return ""; 
    }
}
