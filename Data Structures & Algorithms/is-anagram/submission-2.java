class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() !=t.length())
        return false;

Map <Character, Integer> m = new HashMap<>();
        for ( int i =0;i< s.length();i++){
m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);

//reduce countsby 1 for found char. every char count should be even 
m.put(t.charAt(i),m.getOrDefault(t.charAt(i),0)-1);

        }
    for (int count: m.values()){
        if(count!=0)
        return false;
    }
    return true;
    }
}
