class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
      for(int i = 0; i < strs[0].length(); i++) {
        s += strs[0].charAt(i);
        for(int j = 1; j < strs.length; j++) {
             if(i >= strs[j].length() || !strs[j].substring(0, i + 1).equals(s)) {
                    return s.substring(0, s.length() - 1);
                }

        }
      }
   
        return "";
        
}

    }
