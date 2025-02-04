class LONGESTSUBSTRINGWITHOUTREPEATINGCHARACTERSmedium {
    public int lengthOfLongestSubstring(String s) {
        int[] chars=new int[128];
        int left=0,right=0,maxlength=0;
        while(right<s.length()){
            chars[s.charAt(right)]++;
            while(chars[s.charAt(right)]>1){
                chars[s.charAt(left)]--;
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
            right++;
        }
        return maxlength;
    }
}