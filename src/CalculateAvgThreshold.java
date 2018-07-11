
import static edu.princeton.cs.algs4.StdRandom.uniform;


/**
 * @author andreea teodor
 */
public class CalculateAvgThreshold{
    public static void main(String[] args) {
        double sum = 0.0;
        int times = 0;
        for (int i = 0; i < 100; i++) {
            int n = uniform(2, 100);
            Percolation a = new Percolation(n);
            for (int j = 0; j < n * n; j++) {
                int k = uniform(1, n + 1);
                int q = uniform(1, n + 1);
                a.open(k, q);
                if (a.percolates()) {
                    int openSites = a.numberOfOpenSites();
                    double p = (double) openSites / (n * n);
                    sum += p;
                    times++;
                    break;
                }
            }
        }
        double threshP = sum / times;
        System.out.println("p* = " + threshP);
    }
}