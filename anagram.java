class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String, ArrayList<String>> hm = new LinkedHashMap<>();
        ArrayList<String> str = new ArrayList<>();
        for(int i = 0;i<strs.length;i++){
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String s = String.valueOf(tempArray);
            str.add(s);
        }
        for(int i = 0;i<str.size();i++){
            String temp = str.get(i);
            if(hm.containsKey(temp)){
                hm.get(temp).add(strs[i]);
            }else{
                ArrayList<String> al = new ArrayList<>();
                al.add(strs[i]);
                hm.put(temp,al);
                //hm.put(temp,hm.get(temp).add(i));
            }
        }
       List<List<String>> ans = new ArrayList<>();
        for(String s:hm.keySet()){
            ans.add(hm.get(s));
        }
    return ans;
    }
}
