class Solution {
    public int[] productExceptSelf(int[] nums) {


       /*
       nums = [1,2,4,6]

Output: [48,24,12,8]
       
       */ 
       Map<Integer, Integer> m = new HashMap<>();
       int prod=1;
       int[] res = new int[nums.length];
       int zeroCount=0;
       for(int num:nums){
        if(num==0){
        zeroCount++;}
        else{
        prod= prod*num;
        }
       }
for (int i =0;i<nums.length;i++){
    if(zeroCount==1)
    res[i]= nums[i]==0?prod:0;
    else if (zeroCount>1)
    res[i]=0;
    else
   res[i] = prod/nums[i];
//m.put(i, new Integer(prod/num[i]));

}

return res;

    }
}  
