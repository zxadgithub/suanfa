package com.zxa.graph;

import com.zxa.base.Bag;

import java.util.Scanner;

/**
 * Created by 张新安 on 2017/8/28.
 * 图的实现
 */
public class Graph {
    private final int V;
    private int E;
    private Bag<Integer>[] adj;
    private Graph(int V){
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for(int v = 0; v < V; v++){
            adj[v] = new Bag<Integer>();
        }
    }
    
    public Graph(Scanner in){
        this(in.nextInt());
        int E =  in.nextInt();
        for(int i=0; i< E; i++){
            int v = in.nextInt();
            int w = in.nextInt();
            addEdge(v,w);
        }
    }
    
    public int V(){
        return V;
    }
    public int E(){
        return E;
    }
    
    private void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }
    
    public Iterable<Integer> adj(int v){
        return adj[v];
    }
    
}
