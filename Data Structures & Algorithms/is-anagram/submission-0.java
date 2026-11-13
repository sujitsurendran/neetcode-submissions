class Solution {
    public boolean isAnagram(String s, String t) {

     if(s.length() !=t.length())
     return false;

     char[] c1 = s.toCharArray();
     Arrays.sort(c1);
     String c2 = new String (c1);

     char[] t1 = t.toCharArray();
     Arrays.sort(t1);
     String t2 = new String (t1);

     if(c2.equals(t2))
     return true;
     else
     return false;




    }
}
