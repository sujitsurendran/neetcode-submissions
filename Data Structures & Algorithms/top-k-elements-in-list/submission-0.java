class Solution {
    public int[] topKFrequent(int[] nums, int k) {
//brute technique
Map <Integer, Integer> m = new HashMap<>();
        //Arrays.sort(nums);
        for(int num:nums){
            m.put(num, m.getOrDefault(num,0)+1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){

            arr.add(new int[]{entry.getValue(),entry.getKey()});
            //[[1,3],[2,1],[7,10],[5,7]]
               }
     
            arr.sort(
                (a,b)->b[0]-a[0]
            );
            //[]


            /*Function sort takes a comparison function as a parameter. This is what the sorting algorithm uses repeatedly to compare two elements in the array and decide which one goes to the left of the array and which goes to the right.

If you’re sorting numbers in ascending order, the smallest goes to the left. If you’re sorting in descending order, the biggest goes to the left.

The function needs to return -1 for a to be sorted to the left of b, 1 to be sorted to the right of b and 0 to be considered equal.

In this case a - b returns

a negative number if a is smaller than b – so a will be sorted to the left of b
a positive number if a is bigger than b – so a will be sorted to the right of b
zero if they are equal – so it doesn’t matter which one comes first
If you wanted to sort in descending order, i.e. bigger numbers first, you’d need your function to return b - a to invert the logic.*/
System.out.println("your text");
int[] res = new int[k];
       for (int i=0;i<k;i++) {
        res[i]=arr.get(i)[1];
       }
       return res;
    }
}
