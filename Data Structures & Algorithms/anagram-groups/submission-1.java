class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map < String, ArrayList<String>> m =new HashMap<>();
       for (String str: strs){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedKey = new String(chars);

        m.computeIfAbsent(sortedKey, k->new ArrayList<String>()).add(str);

       }
    return new ArrayList<>(m.values());
       
    }
}
