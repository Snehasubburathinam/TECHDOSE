class Solution {

    List<Integer> []adj;
    boolean []vis;
    boolean []mark;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            adj[i]=new ArrayList<>();
        }
        vis=new boolean[numCourses];
        mark=new boolean[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(isCyclic(i)){
                    return false;
                }
            }
        }
            return true;
        }
        boolean isCyclic(int i){
            vis[i]=true;
            for(Integer j:adj[i]){
                if(!vis[j]){
                    if(isCyclic(j)){
                        return true;
                    }
                }
                else if(!mark[j]){
                    return true;
                }
            }
        mark[i]=true;
        return false;
    }
}
