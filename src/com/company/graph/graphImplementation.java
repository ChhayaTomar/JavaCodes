package com.company.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graphImplementation {
    static class graph{
        ArrayList<Integer>[] arr;

        graph(int n){
            arr=new ArrayList[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=new ArrayList<Integer>();
            }
        }

        void creation(int source, int destination){
            arr[source].add(destination);
            arr[destination].add(source);
        }

        void bfs(int source){
            Queue<Integer> queue=new LinkedList<>();
            boolean[] visited=new boolean[arr.length];
            queue.add(source);

            while(queue.size()!=0){
                int curr=queue.poll();
                visited[curr]=true;
                System.out.print(curr+" ");
                for(Integer i : arr[curr] ){
                    if(visited[i]!=true){
                        queue.add(i);
                        visited[i]=true;
                    }
                }
            }
        }

        void dfs(int source){
            boolean[] visited=new boolean[arr.length];
            dfsRecursive(source,visited);
        }

        private void dfsRecursive(int source, boolean[] visited) {
            visited[source]=true;
            System.out.print(source+ " ");

            for(int i : arr[source]){
                if(!visited[i]){
                    dfsRecursive(i,visited);
                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter total no. of vertices");
        Scanner sc=new Scanner(System.in);
        int vertices=sc.nextInt();
        graph gds=new graph(vertices);
        System.out.println("Enter total no. of edges");
        int edges=sc.nextInt();
        for (int i = 0; i <edges ; i++) {
            int source=sc.nextInt();
            int destination=sc.nextInt();
            gds.creation(source,destination);
        }
        //gds.bfs(0);
        gds.dfs(0);
    }
}
