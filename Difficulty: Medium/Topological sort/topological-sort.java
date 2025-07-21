class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        // Step 2: Compute indegrees
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int node = adj.get(i).get(j);
                indegree[node]++;
            }
        }

        // Step 3: Add all nodes with indegree 0 to queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 4: Process the queue
        ArrayList<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int temp = q.poll();
            ans.add(temp);
            for (int neighbor : adj.get(temp)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        return ans;
    }
}
