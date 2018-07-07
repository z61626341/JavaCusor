package leetCode;

public class ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method Code-------------------------------------------");
		System.out.println("hello >> ll   " + strStr("hello","ll"));
		System.out.println("aaaaa >> bba  " + strStr("aaaaa","bba"));
		System.out.println("aaaaa >> aab  " + strStr("aaaaa","aab"));
		System.out.println("aaa   >> aaaa " + strStr("aaa","aaaa"));
		System.out.println("      >>      " + strStr("",""));
		System.out.println("      >> a    " + strStr("","a"));
		System.out.println("a     >> a    " + strStr("a","a"));
		System.out.println("Hard Code-------------------------------------------");
		System.out.println("hello >> ll   " + strStr2("hello","ll"));
		System.out.println("aaaaa >> bba  " + strStr2("aaaaa","bba"));
		System.out.println("aaaaa >> aab  " + strStr2("aaaaa","aab"));
		System.out.println("aaa   >> aaaa " + strStr2("aaa","aaaa"));
		System.out.println("      >>      " + strStr2("",""));
		System.out.println("      >> a    " + strStr2("","a"));
		System.out.println("a     >> a    " + strStr2("a","a"));
	}
    public static int strStr(String haystack, String needle) {
    	return ((haystack == null && needle.isEmpty()) ? 0 : haystack.indexOf(needle,0));
    }
    public static int strStr2(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length()==0)
            return  0;
        
        for(int i=0; i<haystack.length();i++){
            int prev = i, j=0;
            if (i + needle.length() > haystack.length()) return -1;
            
            while(i<haystack.length() && j <needle.length() && haystack.charAt(i) == needle.charAt(j)){
                i++; j++;
            }
            if(j==needle.length())
                return prev;
            i=prev;
        }
        return -1; 
    }

}
