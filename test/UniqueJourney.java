import java.util.*;
public class UniqueJourney {
    static HashSet<Integer> ans = new HashSet<>();
    static void dfs_cycle(int u, int p, ArrayList<Integer>[] graph, int[] color, int[] par, int[] cyclenumber) {
        // If already completely visited vertex.
        if (color[u] == 2) {
            return;
        }
        // If seen vertex, but not completely visited -> cycle detected.
        // Backtrack based on parents to find the complete cycle.
        if (color[u] == 1) {
            ArrayList<Integer> v = new ArrayList<>();
            cyclenumber[0]++;
            int cur = p;
            v.add(cur);
            ans.add(cur);
            // Backtrack the vertex in the current cycle that's found
            while (cur != u) {
                cur = par[cur];
                v.add(cur);
                ans.add(cur);
            }
            return;
        }
        par[u] = p;
        // Partially visited.
        color[u] = 1;
        // Simple dfs on graph
        for (int v : graph[u]) {
            // If it has not been visited previously
            if (v == par[u] || color[v] == 2) {
                continue;
            }
            dfs_cycle(v, u, graph, color, par, cyclenumber);
        }
        // Completely visited.
        color[u] = 2;
    }
    static ArrayList<Integer> magicPaths(ArrayList<Pair<Integer, Integer>> edges, int n, int m) {
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        // Create Adjacency list
        for (Pair<Integer, Integer> x : edges) {
            graph[x.first].add(x.second);
            graph[x.second].add(x.first);
        }
        int[] color = new int[n + 1];
        int[] par = new int[n + 1];
        int[] cyclenumber = new int[1];
        dfs_cycle(1, 0, graph, color, par, cyclenumber);
        ArrayList<Integer> ans_vec = new ArrayList<>(Collections.nCopies(n, 0));
        for (int x : ans) {
            ans_vec.set(x - 1, 1);
        }
        return ans_vec;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Pair<Integer, Integer>> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges.add(new Pair<>(a, b));
        }
        ArrayList<Integer> ans = magicPaths(edges, n, m);
        for (int x : ans) {
            System.out.print(x + " ");
        }
        scanner.close();
    }
    static class Pair<A, B> {
        A first;
        B second;
        Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }
}