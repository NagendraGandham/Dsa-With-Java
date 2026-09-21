package Graphs.CycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleUndirectedGraph {
//    static boolean hasCycle(List<List<Integer>> graph,int v){
//        boolean[] visited=new boolean[v];
//        for(int i=0;i<v ;i++){
//            if(!visited[i]){
//                if(dfs(i,-1,graph,visited)){
//                    return true;
//                }
//            }
//        }
//        return false;
//        for(int i=0;i<v;i++){
//            if(!visited[i]) {
//                if (bfs(i, graph, visited)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    static boolean dfs(int start,int parent,List<List<Integer>> graph,boolean[] visited){
        visited[start]=true;
        for(int neighbour:graph.get(start)){
            if(!visited[neighbour]) {
                if (dfs(neighbour, start, graph, visited)) {
                    return true;
                }
            }
                else if(neighbour  !=parent){
                    return true;
                }
        }
        return false;
    }

    static private boolean bfs(int start, List<List<Integer>> graph, boolean[] visited) {
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{start,-1});
        visited[start]=true;
        while(!q.isEmpty()){
            int[] current=q.poll();
            int node=current[0];
            int parent=current[1];
            for(int neighbout:graph.get(node)){
                if(!visited[neighbout]){
                    visited[neighbout]=true;
                    q.offer(new int[]{neighbout,node});
                }
                else if(visited[neighbout] && neighbout!=parent){
                    return true;
                }
            }
        }
        return false;
    }

    static class DisjointSet{
        private int[] parent,rank;
        DisjointSet(int n){
            parent=new int[n];
            rank=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                rank[i]=0;
            }
        }

        int find(int x){
            if(parent[x]==x){
                return x;
            }
            parent[x]=find(parent[x]);
            return parent[x];
        }

        void union(int u,int v){
            int pu=find(u);
            int pv=find(v);
            if(pu==pv){
                return ;
            }
            if(rank[pu]<rank[pv]){
                parent[pu]=pv;
            }
            else if(rank[pu]>rank[pv]){
                parent[pv]=pu;
            }
            else{
                parent[pu]=pv;
                rank[pv]++;
            }
        }

    }


static boolean hasCycle(List<List<Integer>> graph,int V){
        DisjointSet dsu=new DisjointSet( V);
        for(int u=0;u<V;u++){
            for(int v:graph.get(u)){
                if(u<v){
                    int pu=dsu.find(u);
                    int pv=dsu.find(v);
                    if(pu==pv){

                        return true;
                    }
                    dsu.union(u,v);
                }
            }
        }
        return false;
}

    static void addEdge(List<List<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int V=8;
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<V;i++) {
            graph.add(new ArrayList<>());
        }
            addEdge(graph,0,1);
            addEdge(graph,0,3);
            addEdge(graph,1,2);
            addEdge(graph,2,5);
            addEdge(graph,2,4);
//            addEdge(graph,4,5  );
            addEdge(graph,5,6);
            addEdge(graph,6,7);
//            addEdge(graph,5,7);


            boolean result=hasCycle(graph,V);
        System.out.println(result);

    }
}
