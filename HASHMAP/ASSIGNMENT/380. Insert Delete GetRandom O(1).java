class RandomizedSet {
    Map<Integer,Integer>map;
    List<Integer>list;
    java.util.Random rand;
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
        rand=new java.util.Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int indx=map.get(val);
        map.remove(val);
        if(indx==list.size()-1){
           list.remove(list.size()-1);
        }else{
            int last=list.get(list.size()-1);
            list.set(indx,last);
            map.put(last,indx);
            list.remove(list.size()-1);
        }
         return true;  
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
