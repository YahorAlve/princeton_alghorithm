package algorithms.union_find;

public class QuickFindUF implements UF {

    private int[] array;

    public QuickFindUF(int N) {
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int first = array[p];
        int second = array[q];
        if (first != second) {
            for (int i : array) {
                if (i == second){
                    i = first;
                }
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return array[p] == array [q];
    }

    @Override
    public int findComponent(int p) {
        return 0;
    }

    @Override
    public int countComponents() {
        return 0;
    }
}
