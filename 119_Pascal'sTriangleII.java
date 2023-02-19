// optimize code
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        if(rowIndex==0){
            return list;
        }
        long temp=1;      // temp store last value so it exceeds the limit of integer so that why we store value in long
        for(int i=1,up=rowIndex,down=1;i<=rowIndex;i++,down++,up--){
            temp=temp*(up)/down;
            list.add((int)temp);
        }
   
        return list;
        
    }
}

//Using previous question(118. Pascal triangle) method
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<=rowIndex;i++){
            list.add(0,1);
            for(int j=1;j<list.size()-1;j++){
                list.set(j,list.get(j)+list.get(j+1));
            }
            ans.add(new ArrayList<>(list));
            if(ans.size()-1==rowIndex){
                return ans.get(ans.size()-1);
            }

        }
        return list;
        
    }
}
