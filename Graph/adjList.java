import java.util.*;

public class adjList {
    public static class Edge {
        int source;
        int destination;
        int weight;
        Edge(int src,int dest,int wt){
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }

    
    public static ArrayList<Edge>[] createGraph1() {
        /*
          (5)
        0-----1
              /\
        (1)  /  \ (3)
            /    \
           2 ---- 3
           |  (1)
       (3) |
           |
           4
        */
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> [] graph = new ArrayList[v];
        //now create arraylist at every edge
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0,1,5));
        
        //1-vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        
        //2-vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

        //3-vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        //4-vertex
        graph[4].add(new Edge(4,2,2));

        return graph;
    }

    public static ArrayList<Edge>[] createGraph2() {
        /*
        0
          1------3
         /       |\
        0        | 5----6  
         \       |/
          2------4
        */
        int v=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> [] graph = new ArrayList[v];
        //now create arraylist at every edge
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        
        //1-vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        
        //2-vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //3-vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //4-vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //5-vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        graph[5].add(new Edge(5,5,1));

        return graph;
    }

    public static void bfs(ArrayList<Edge> graph[],int v){ //O(V+E)
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            visited[i]=false;
        }
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Queue<Integer> q =new LinkedList();
        q.add(0);
        while(!q.isEmpty()){
            int u=q.remove();
            if(!visited[u]){
                System.out.print(u+" ");
                visited[u]=true;
                for(int i=0;i<graph[u].size();i++){
                    Edge e= graph[u].get(i);
                    q.add(e.destination);
                }
            }
        }
        System.out.println();
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,int v,boolean visited[]){ //O(V+E)
        if(visited[curr]){
            return;
        }
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            dfs(graph,graph[curr].get(i).destination,v,visited);
        }
    }

    public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,int v,boolean visited[]){ //O(V+E)
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            //neighbour = e.destination
            if(!visited[e.destination] && hasPath(graph, e.destination, dest, v, visited)){
                return true;
            }
            
        }
        return false;
        }
    

    public static void main(String[] args) {
        
        int v=5;

        ArrayList<Edge> [] graph = createGraph1();
        ArrayList<Edge> [] graph1 = createGraph2();
        
        // for(int i=0;i<graph[2].size();i++){
        //     ArrayList<Edge> e = graph[2];
        //     System.out.println(e.get(i).destination);
        // }
        
        // bfs(graph, v);
        // bfs(graph1, 7);
        dfs(graph1,0,7,new boolean[7]);
        System.out.println(hasPath(graph1, 0, 2, v, new boolean[v]));
    }
}
