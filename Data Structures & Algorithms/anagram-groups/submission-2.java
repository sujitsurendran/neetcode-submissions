class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

Map <String, ArrayList<String>> m = new HashMap<>();
for(String str: strs){
 char[] c = str.toCharArray();
 Arrays.sort(c);

 String sortedKey = new String(c);

 m.computeIfAbsent(sortedKey,k->new ArrayList<String>()).add(str);


}
return new ArrayList(m.values());



    }
}
