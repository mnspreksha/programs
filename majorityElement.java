class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int size = nums.length;
        int n = (int)(size/3);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<size;i++){
            hm.put(nums[i],0);
        }
        for(int i=0;i<size;i++){
            int k = hm.get(nums[i]);
            hm.put(nums[i],k+1);
        }
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            Integer x =(Integer) m.getValue();
            if(x>n){
                al.add((Integer)m.getKey());
            }
        }
        return al;
    }
}
