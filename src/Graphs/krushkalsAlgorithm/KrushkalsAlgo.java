package Graphs.krushkalsAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Edge{
    int u,v,w;
    Edge(int u,int v,int w){
        this.u=u;
        this.v=v;
        this.w=w;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "u=" + u +
                ", v=" + v +
                ", w=" + w +
                '}';
    }
}
class DisjointSet{
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

public class KrushkalsAlgo {

    public static void main(String[] args) {
        int V=9;
        List<Edge> edgeList=new ArrayList<>();
        edgeList.add(new Edge(0,1,1));
        edgeList.add(new Edge(0,2,6));
        edgeList.add(new Edge(1,2,6));
        edgeList.add(new Edge(1,3,5));
        edgeList.add(new Edge(2,6,5));
        edgeList.add(new Edge(3,4,10));
        edgeList.add(new Edge(3,6,2));
        edgeList.add(new Edge(4,5,3));
        edgeList.add(new Edge(4,8,7));
        edgeList.add(new Edge(5,8,8));
        edgeList.add(new Edge(6,8,8));
        edgeList.add(new Edge(7,8,12));
        Collections.sort(edgeList,(s1,s2)->s1.w-s2.w);
        System.out.println(edgeList);

        DisjointSet dsu=new DisjointSet(V);
        List<Edge> mst=new ArrayList<>();
        int totalWeight=0;
        for(Edge e:edgeList){
            if(dsu.find(e.u)!=dsu.find(e.v)){
                mst.add(e);
                totalWeight+=e.w;
                dsu.union(e.u,e.v);
            }
        }

        System.out.println(totalWeight);
    }
}
