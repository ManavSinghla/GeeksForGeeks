class Solution {
    static class Pair {
        int node;
        int dist;
        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    public int[] dijkstra(int V, int[][] edges, int src) {

        // Step 1: Create adjacency list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // Assuming undirected graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }

        // Step 2: Distance array
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // Step 3: Min Heap
        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> a.dist - b.dist);

        dist[src] = 0;
        pq.add(new Pair(src, 0));

        // Step 4: Dijkstra
        while (!pq.isEmpty()) {

            Pair current = pq.poll();
            int node = current.node;
            int currDist = current.dist;

            // Skip outdated entries
            if (currDist > dist[node]) continue;

            for (Pair neighbor : adj.get(node)) {

                int adjNode = neighbor.node;
                int weight = neighbor.dist;

                if (currDist + weight < dist[adjNode]) {

                    dist[adjNode] = currDist + weight;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }

        return dist;
    }
}