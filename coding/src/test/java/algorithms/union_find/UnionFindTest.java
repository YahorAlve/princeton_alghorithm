package algorithms.union_find;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class UnionFindTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void quickFindUFTest1() {
        UF myUF = generateUF();
        Assert.assertTrue(myUF.connected(8, 9));
        Assert.assertTrue(myUF.connected(1, 7));
        Assert.assertFalse(myUF.connected(0, 7));
        Assert.assertTrue(myUF.countComponents() == 3);
    }

    private UF generateUF() {
        String fileName = "/union_find/tinyUF.txt";
        UF uf;
        try {
            Scanner scanner = new Scanner(new FileReader(getClass().getResource(fileName).toURI().getPath()));
            int N = scanner.nextInt();
            uf = new QuickFindUF(N);
            while (scanner.hasNextLine()) {
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                if (!uf.connected(p, q)) {
                    uf.union(p, q);
                    System.out.println(p + " " + q);
                }
            }
            scanner.close();
            return uf;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
