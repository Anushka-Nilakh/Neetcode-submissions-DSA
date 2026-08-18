class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            
            String s=strs[i];
            
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!map.containsKey(st)){
               map.put(st,new ArrayList<String>());
            }
            map.get(st).add(s);
        }
            for(Map.Entry<String,List<String>> e:map.entrySet()){
               ans.add(e.getValue());
            }
        
        return ans;
    }
}
