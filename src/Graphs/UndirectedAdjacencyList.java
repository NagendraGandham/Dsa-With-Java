package Graphs;

import java.util.ArrayList;


public class UndirectedAdjacencyList {
    private ArrayList<Integer>[] adjList;
    private int vertices;

    UndirectedAdjacencyList(int vertices){
        this.vertices=vertices;
        adjList=new ArrayList[vertices];

        for(int i=0;i<vertices;i++){
            adjList[i]=new ArrayList<>();
        }
    }


    public void addEdge(int u,int v){
        adjList[u].add(v);
        adjList[v].add(u);
    }

    public void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.println(i+"   :"+adjList[i]);
        }
    }


    public static void main(String[] args){
        UndirectedAdjacencyList graph=new UndirectedAdjacencyList(6);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.printGraph();
    }

}
