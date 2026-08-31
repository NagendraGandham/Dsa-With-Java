package Graphs;

import java.util.*;

public class UnDirectedGraphUsingListOfList {

    private List<List<Integer>> adjList;
    private int vertices;


    UnDirectedGraphUsingListOfList(int vertices){
        this.vertices=vertices;
        adjList=new ArrayList<>();

        for(int i=0;i<vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u,int v){

        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }

    public void addVertex(){
        adjList.add(new ArrayList<>());
        vertices++;
    }

    public void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.println(i+"   :"+adjList.get(i));
        }
    }

    private void bfsTraversal(int start) {
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[adjList.size()];
        queue.add(start);
        visited[start]=true;

        while(!queue.isEmpty()){
            int u=queue.poll();
            System.out.print(u+" ");
            for(int neighbour:adjList.get(u)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }

    }

    void dfsTraversalUsingStack(int start){
        boolean[] visited=new boolean[adjList.size()];
        Stack<Integer> stack=new Stack<>();
        stack.push(start);
//        visited[start]=true;
//        while(!stack.isEmpty()){
//            int u=stack.pop();
//            System.out.print(u+" ");
//            for(int neighbour:adjList.get(u)){
//                if(!visited[neighbour]){
//                    visited[neighbour]=true;
//                    stack.push(neighbour);
//                }
//            }0 3 5 4 2 1
        while(!stack.isEmpty()){
            int u=stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u+" ");
            }
            for(int i:adjList.get(u)){
                if(!visited[i]){
                    stack.push(i);
                }
            }
        }
    }


    public static void main(String[] args){
       UnDirectedGraphUsingListOfList graph=new UnDirectedGraphUsingListOfList(6);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addVertex();
        graph.printGraph();
        graph.bfsTraversal(0);
        System.out.println();
        graph.dfsTraversalUsingStack(0);
    } 
}
