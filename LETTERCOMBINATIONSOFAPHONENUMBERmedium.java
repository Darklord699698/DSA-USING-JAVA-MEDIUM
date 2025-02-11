import java.util.*;
class LETTERCOMBINATIONSOFAPHONENUMBERmedium {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) return new ArrayList<>();

        String[] mappings={"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result=new ArrayList<>();

        backtrack(result,digits,mappings,new StringBuilder(),0);
        return result;
    }
    private void backtrack(List<String> result,String digits,String[] mappings,StringBuilder current,int index){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        String letters=mappings[digits.charAt(index)-'0'];
        for(char c:letters.toCharArray()){
            current.append(c);
            backtrack(result,digits,mappings,current,index+1);
            current.deleteCharAt(current.length()-1);
        }
    }
}