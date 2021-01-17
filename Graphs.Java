Question link :- https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

static ArrayList<integer> dfs(ArrayList<arraylist<integer>> g, int N)
{
ArrayList<integer> al = new ArrayList<>();
boolean[] visited = new boolean[N];
dfsUtil(0, visited, al, g);
return al;

}

static void dfsUtil(int node, boolean[] visited, ArrayList<integer> al, ArrayList<arraylist<integer>> g){
visited[node] = true;
al.add(node);
for(int i: g.get(node)){
if(visited[i] == false){
dfsUtil(i, visited, al, g);
}
}
}

Question link:https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

bool vis[100005];
vector<int> bfs(vector<int> g[], int N)
{
vector<int>v;
vis[0]=true;
queue<int>q;
q.push(0);
while(!q.empty())
{
int x=q.front();
v.push_back(x);
q.pop();
for(auto i:g[x])
{
if(!vis[i])
{
vis[i]=true;
q.push(i);
}
return v
}
}





Question link:https://leetcode.com/problems/flood-fill/
class Solution {  
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }
        image[sr][sc] = newColor;
        return DFS(image,sr,sc,oldColor);
    }

    public int[][] DFS(int[][] image, int sr, int sc, int oldColor) {
        int[][] move = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for (int i = 0; i < 4; i++) {
            int m = sr + move[i][0];
            int n = sc + move[i][1];
            if (m >= 0 && m < image.length && n >= 0 && n < image[0].length) {
                if (image[m][n] == oldColor) {
                    image[m][n] = image[sr][sc];
                    image = DFS(image, m, n, oldColor);
                }
            }
        }
        return image;
    }
}
