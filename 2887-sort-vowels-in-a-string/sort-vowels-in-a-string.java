class Solution {
    public String sortVowels(String s) {
      String vow="aeiouAEIOU";
      Map<Character,Integer> mp=new HashMap<>();
      ArrayList<Character> li=new ArrayList<>();
      ArrayList<Integer> li1=new ArrayList<>();
      for(int i=0;i<s.length();i++){
          if(vow.contains(String.valueOf(s.charAt(i)))){
              li.add(s.charAt(i));
              li1.add(i);
            //   System.out.print(li);
          }
      }
              Collections.sort(li);
      StringBuilder str=new StringBuilder(s);
      for(int i=0;i<li.size();i++){
          str.setCharAt(li1.get(i),li.get(i));
      }
              System.out.print(li);
      return str.toString();  
    }
}