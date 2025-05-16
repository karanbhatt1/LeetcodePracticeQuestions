package dfs;
import java.util.*;
//haspath() --> leetcode1971
class Solution {
    public static boolean isPath(List<List<Integer>>graph,int source, int destination,boolean[]visited){
        if(source==destination){
            return true;
        }
        visited[source]=true;
        for(int nbr : graph.get(source)){
            if(!visited[nbr]){
                if(isPath(graph,nbr,destination,visited)){
                    return true;
                }
            }
        }
        return false;
    }
   public static List<List<Integer>> conversionToAl(int[][]edges,int n){
        List<List<Integer>> graph = new LinkedList<>();
        for(int i=0;i<n;i++){
            graph.add(new LinkedList<Integer>());
        }

            for (int[] edge : edges) {
                int v1 = edge[0];
                int v2 = edge[1];
                graph.get(v1).add(v2);
            }


        return graph;
    }
//    public static boolean validPath(int n, int[][] edges, int source, int destination) {
//        int rows = edges.length;
//        if(rows==0){
//            return true;
//        }
//        int cols = edges[0].length;
//        List<List<Integer>> graph = new LinkedList<>();
//        for(int i=0;i<n;i++){
//            graph.add(new LinkedList<Integer>());
//        }
//        for(int edge[]: edges){
//            for(int j = 0;j<edge.length;j++){
//                graph.get(j).add(edge[j]);
//            }
//        }
//
//        boolean [] visited = new boolean[n];
//        return isPath(graph,source,destination,visited);
//
//
//
//
//
//
//
//
//
//    }

    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,2},{2,0}};
        boolean[] vis = new boolean[3+1];
        System.out.println(isPath(conversionToAl(mat,3),0,2,vis));

    }
}