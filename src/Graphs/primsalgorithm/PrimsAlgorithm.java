package Graphs.primsalgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Pair{
    int node;
    int weight;
    int parent;

    public Pair(int node, int weight, int parent) {
        this.node = node;
        this.weight = weight;
        this.parent = parent;
    }
}

public class PrimsAlgorithm {


    private static void primsMST(List<List<Edge>> graph, int v) {
        boolean[] visited=new boolean[v];
        PriorityQueue<Pair> pq=new PriorityQueue<>((s1,s2)-> s1.weight-s2.weight);

        int totalCost=0;
        pq.offer(new Pair(0,0,-1));
        while(!pq.isEmpty()){
            Pair current=pq.poll();
            int node=current.node;
            if(visited[node]){
                continue;
            }
            visited[node]=true;
            totalCost+=current.weight;
            for(Edge edge:graph.get(node)){
                if(!visited[edge.vertex]) {
                    pq.offer(new Pair(edge.vertex, edge.weight, node));
                }
            }
        }
        System.out.println(totalCost);
    }


    public static void main(String[] args) {
        int V = 8;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 4));
        graph.get(1).add(new Edge(0, 4));

        graph.get(0).add(new Edge(5, 4));
        graph.get(5).add(new Edge(0, 4));

        graph.get(1).add(new Edge(2, 4));
        graph.get(2).add(new Edge(1, 4));

        graph.get(1).add(new Edge(5, 4));
        graph.get(5).add(new Edge(1, 4));

        graph.get(1).add(new Edge(7, 4));
        graph.get(7).add(new Edge(1, 4));

        graph.get(2).add(new Edge(3, 4));
        graph.get(3).add(new Edge(2, 4));

        graph.get(2).add(new Edge(7, 4));
        graph.get(7).add(new Edge(2, 4));

        graph.get(3).add(new Edge(4, 4));
        graph.get(4).add(new Edge(3, 4));

        graph.get(7).add(new Edge(4, 4));
        graph.get(4).add(new Edge(7, 4));

        graph.get(6).add(new Edge(4, 4));
        graph.get(4).add(new Edge(6, 4));

        graph.get(5).add(new Edge(6, 4));
        graph.get(6).add(new Edge(5, 4));

        graph.get(7).add(new Edge(6, 4));
        graph.get(6).add(new Edge(7, 4));

        graph.get(7).add(new Edge(5, 4));
        graph.get(5).add(new Edge(7, 4));

        primsMST(graph,V);


    }

}
