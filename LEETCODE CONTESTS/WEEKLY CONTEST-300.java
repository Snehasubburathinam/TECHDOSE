class Solution {
    public String decodeMessage(String key, String message) {
        int i , alphabet = 97 ;
        StringBuilder decoded = new StringBuilder() ;
        Map<Character,Character> map = new HashMap<>() ;
        map.put(' ', ' ') ;
        for(i=0;i<key.length();i++)
        {
            if(!map.containsKey(key.charAt(i)))
            {
                map.put(key.charAt(i),(char)alphabet++) ;  
            }
        }
        for(i=0;i<message.length();i++)
        {
            if(message.charAt(i)!=' ')
            {
                decoded.append(map.get(message.charAt(i))) ;
            }
            else
            {
                decoded.append(' ') ;
            }
        }
        return decoded.toString() ;
    }
}
