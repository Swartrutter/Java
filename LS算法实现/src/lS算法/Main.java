package lSÀ„∑®;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int[] vertexs= {0,1,2,3,4,5};
		int[][] edges = {
                {0,6,3,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {6,0,2,5,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {3,2,0,3,4,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,5,3,0,5,3},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,4,5,0,5},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,3,5,0}
        
        };
//		int[] vertexs = {0,1,2};
//		int[][] edges= {
//				{0,2,7},
//				{2,0,1},
//				{7,1,0}
//		};
		LS ls = new LS(5,vertexs,edges);
		ls.update();
		ls.Print();
	}
}

class Node{
	public int order;
	public List path;
	public Node(int order) {
		super();
		this.order = order;
		this.path = new ArrayList ();
	}
}

class LS{
	private int source;
	private int[] dists;
	private List<Node> unvisits;
	private List<Node> visits;
	private int[][] edges;

	public LS(int source, int[] vertexs, int[][] edges) {
		super();
		this.source = source;
		this.edges = edges;
		
		dists = new int [vertexs.length];
		for(int i=0;i<vertexs.length;i++) {
			dists[i]=edges[source][i];
		}
		
		unvisits = new ArrayList<Node>();
		visits = new ArrayList<Node>();
		for(int i=0;i<vertexs.length;i++) {
			Node n = new Node(i);
			if(i==source) {
				visits.add(n);
			}
			else {
				if(dists[i]<Integer.MAX_VALUE) {
					n.path.add(source);
				}
				unvisits.add(n);
			}
		}
       disp();
	}

	void Print() {
		Iterator it = visits.iterator();
		while (it.hasNext()) {
			Node key = (Node)it.next();
			System.out.printf("%d     ",key.order);
			for(int i=0;i<key.path.size();i++) {
				System.out.printf("%d,",key.path.get(i));
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<dists.length;i++) {
			System.out.printf("%d ", dists[i]);
		}
	}
	
	void disp() {
		Iterator it = unvisits.iterator();
		while (it.hasNext()) {
			Node key = (Node)it.next();
			System.out.printf("%d     ",key.order);
			for(int i=0;i<key.path.size();i++) {
				System.out.printf("%d,",key.path.get(i));
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void update() {
		while(!unvisits.isEmpty()) {
			int order = distMin();
//			System.out.println(order);
			visits.add(unvisits.get(order));
			unvisits.remove(order);
//			System.out.println(visits.get(visits.size()-1).order);
			List<Node>neiborgh = getNeiborgh();
			System.out.println();
			for(int i=0;i<neiborgh.size();i++) {
				int dist=dists[visits.get(visits.size()-1).order]+edges[visits.get(visits.size()-1).order][neiborgh.get(i).order];
				if(dists[neiborgh.get(i).order]>dist) {
					dists[neiborgh.get(i).order]=dist;
					unvisits.get(i).path.add(visits.get(visits.size()-1).order);
				}
			}
			disp();
		}
	}
	
	int distMin() {
		int minorder=0;
		for(int i=0;i<unvisits.size();i++) {
			int dist=dists[unvisits.get(i).order];
			if(dist<dists[unvisits.get(minorder).order]) minorder=i;
		}
		return minorder;
	}
	
	List<Node> getNeiborgh() {
		List<Node> neiborgh = new ArrayList<Node>();
		for(int i=0;i<unvisits.size();i++) {
			if(edges[visits.get(visits.size()-1).order][unvisits.get(i).order]<Integer.MAX_VALUE) {
				neiborgh.add(unvisits.get(i));
			}
		}
		return neiborgh;
	}
}
