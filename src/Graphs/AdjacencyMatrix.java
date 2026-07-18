package Graphs;

public class AdjacencyMatrix {
    private int[][] matrix;
    private int vertices;


    AdjacencyMatrix(int vertices){
        this.vertices=vertices;
        matrix=new int[vertices][vertices];
    }

    //undirected graph
    public void addEdge(int startVertex,int endVertex){
        matrix[startVertex][endVertex]=1;
        matrix[endVertex][startVertex]=1;
    }

    public void printMatrix(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix graph=new AdjacencyMatrix(6);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.printMatrix();
    }
}
