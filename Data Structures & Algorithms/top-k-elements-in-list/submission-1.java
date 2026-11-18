class Solution {
    public int[] topKFrequent(int[] nums, int k) {



Map <Integer, Integer> m = new HashMap<>();
// map to get counts of each number
List<Integer>[] freq = new List[nums.length+1];
// list to ultimately hold list of numbers for each freq possibility
//freq possibility is 0,1,2... , nums.length, so we need nums.length+1 size
for (int i=0;i<freq.length;i++){
//initilaize freq array
    freq[i] = new ArrayList<>();
}


for(int num : nums){

m.put(num,m.getOrDefault(num,0)+1);
// this creates a map with each object as key and values are number of occurences

}

for (Map.Entry<Integer,Integer> entry: m.entrySet()){
freq[entry.getValue()].add(entry.getKey());
// this wll create
//freq[1] ={ 7,3,2}
//freq[2] ={4,6}
}

int index =0;

int[] res = new int[k];
for (int i = freq.length-1; i>0 && index <k; i--){
    
    for (int n: freq[i]){
        res[index++]=n;
        if(index==k)
        return res;
    }

}
return res;
        
    }
}
