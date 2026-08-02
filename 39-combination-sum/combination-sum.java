class Solution {
    public List<List<Integer>> combinationSum(int[] candidates,int target){
    List<List<Integer>> result=new ArrayList<>();// stores the entire result
    backtrack(candidates,target,0,new ArrayList<>(),result,0);
    return result;
}
private  void backtrack(int[] candidate,int target,int start,List<Integer> current,List<List<Integer>> result,int sum){
        //base case 1
        if (sum==target) {
            result.add(new ArrayList<>(current));//creates a copy of ans,this won't be modified 
            return;
        }
        //base case 2
        if (sum>target) {
            return;
        }
        for(int i=start;i<candidate.length;i++){
            current.add(candidate[i]);
            backtrack(candidate,target,i,current,result,sum+candidate[i]);//we use i instead of start so that we can reuse the elment
            current.remove(current.size()-1);
        }
    }
}