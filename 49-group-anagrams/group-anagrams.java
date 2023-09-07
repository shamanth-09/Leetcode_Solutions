class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Arrays.sort(strs);
        Map<String,ArrayList<String>> mp=new HashMap<>();
        for(String ele:strs){
            String og =ele;
            char arr[]=ele.toCharArray();
            Arrays.sort(arr);
            String ky = new String(arr);

            if(mp.containsKey(ky)){
                mp.get(ky).add(og);
            }
            else{
                ArrayList<String>  a = new ArrayList<>();
                a.add(og);
                mp.put(ky,a);
            }
        }
        return new ArrayList<>(mp.values());
        
    }
}