// Using List 
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            list.add(0,1);
            for(int j=1;j<list.size()-1;j++){
                list.set(j,list.get(j)+list.get(j+1));
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
        
    }
}

// Using recursion
class Solution {
     List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
       
        List<Integer> l=new ArrayList<>();
        l.add(1);
        ans.add(l);

        recursion(1,numRows);
        return ans;
        
    }
    public void recursion(int r,int last){
        if(r==last){
            return;
        }
        List<Integer> l=new ArrayList<>();
        l.add(1);
        for(int i=1;i<r;i++){
            l.add(ans.get(r-1).get(i)+ans.get(r-1).get(i-1));
        }
        l.add(1);
        ans.add(l);
        recursion(r+1,last);
    }
}
