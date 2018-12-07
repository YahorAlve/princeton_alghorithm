package algorithms.union_find;

import java.util.HashSet;
import java.util.Set;

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
            for (int i = 0; i < array.length; i++) {
                if (array[i] == second){
                    array[i] = first;
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
        return array[p];
    }

    @Override
    public int countComponents() {
        Set components = new HashSet();
        for (int i: array) {
            components.add(i);
        }
        return components.size();
    }
}
