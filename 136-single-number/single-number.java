class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int ele:nums){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        System.out.print(mp);
       for(Map.Entry<Integer,Integer> i:mp.entrySet()){
           if(i.getValue()==1){
               return i.getKey();
           }
       }
        return 0;
    }
}