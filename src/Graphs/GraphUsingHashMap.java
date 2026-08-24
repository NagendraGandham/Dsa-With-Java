package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphUsingHashMap {
    private HashMap<Integer, List<Integer>> adjMap;
    GraphUsingHashMap(){
        adjMap=new HashMap<>();
    }

    public void addEdge(int u,int v){
        adjMap.putIfAbsent(u,new ArrayList<>());
        adjMap.putIfAbsent(v,new ArrayList<>());

        adjMap.get(u).add(v);
        adjMap.get(v).add(u);
    }

    public void printGraph(){
        for(int v: adjMap.keySet()){
            System.out.println(v+" ----> "+adjMap.get(v));
        }
    }

    public static void main(String[] args) {
        GraphUsingHashMap graph=new GraphUsingHashMap();
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(0,3);
        graph.printGraph();
    }
}
