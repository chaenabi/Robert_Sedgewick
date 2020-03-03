package ch4.section1.bingdal.DFS;

import ch4.section1.bingdal.Graph;

public class BDFS {

    private boolean[] marked;
    private int count;



    public BDFS(Graph G, int s) {
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        count++;
        for (int w : G.adj(v)){
            if(!marked[w])  // marked[w]가 false이면 실행해라.
                dfs(G, w);
        }
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }
}
