class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        char arr1[]=t.toCharArray();
        Arrays.sort(arr1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr1[i]){
            return false;
            }
        }
        
        return true;

    }
}