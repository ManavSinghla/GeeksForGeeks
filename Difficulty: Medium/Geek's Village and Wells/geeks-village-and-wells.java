// User function Template for Java
class Pair {
    int x, y;
    
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int[][] chefAndWells(int n, int m, char c[][]) {
        int[][] ans=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='H') ans[i][j]=-1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='W'){
                    q.add(new Pair(i, j));
                }
            }
        }
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        int a=2;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair node=q.poll();
                for(int j=0;j<4;j++){
                    int x=node.x+dx[j];
                    int y=node.y+dy[j];
                    if(x>=0 && y>=0 && x<n && y<m){
                        if(c[x][y]=='H'){
                            ans[x][y]=a;
                            q.add(new Pair(x, y));
                            c[x][y]='W';
                        }
                        else if(c[x][y]=='.'){
                            q.add(new Pair(x, y));
                            c[x][y]='W';
                        }
                    }
                }
            }
            a+=2;
        }
        return ans;
    }
}