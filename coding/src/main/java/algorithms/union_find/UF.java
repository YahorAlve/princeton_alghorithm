package algorithms.union_find;

public interface UF {

    void union(int p, int q);

    boolean connected(int p, int q);

    int findComponent(int p);

    int countComponents();
}
