import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DFS_graph {
    private LinkedList<Integer> adjacency[];
    public DFS_graph(int v)
    {
        adjacency=new LinkedList[v];
        for (int i = 0; i <v ; i++) {
            adjacency[i]=new LinkedList<Integer>();
        }
    }
    public void insert(int s,int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);

    }

    public void dfs(int start)
    {
        boolean visited_node[]=new boolean[adjacency.length];
        int parent_node[]=new int[adjacency.length];
        Stack<Integer> q=new Stack<>();
        q.add(start);
        visited_node[start]=true;
        parent_node[start]=-1;
        while(!q.isEmpty())
        {
            int p=q.pop();
            System.out.println(p);
            for (int i:adjacency[p]) {
                if(visited_node[i]!=true)
                {
                    visited_node[i]=true;
                    q.add(i);
                    parent_node[i]=p;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int v=s.nextInt();
        System.out.println("Enter the number of edges: ");
        int e=s.nextInt();
        DFS_graph obj=new DFS_graph(v);
        System.out.println("Enter the data of graph: ");
        for (int i = 0; i < e; i++) {
            int source=s.nextInt();
            int dest=s.nextInt();
            obj.insert(source,dest);
        }
        System.out.println("Enter the source for BFS traversal: ");
        int start=s.nextInt();
        System.out.println("DFS: ");
        obj.dfs(start);
    }
}
