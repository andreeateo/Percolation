
import static edu.princeton.cs.algs4.StdRandom.uniform;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    Percolation a;
    double[] prob;
    int trials;

    public PercolationStats(int n, int trials) {    // perform trials independent experiments on an n-by-n grid
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException();
        }
        this.trials = trials; 
        prob = new double[trials];
        for (int i = 0; i < trials; i++) {
            Percolation w = new Percolation(n);
            for (int j = 0; j < n * n; j++) {
                int k = uniform(1, n + 1);
                int q = uniform(1, n + 1);
                w.open(k, q);
                if (w.percolates()) {
                    int openSites = w.numberOfOpenSites();
                    double p = (double) openSites / (n * n);
                    prob[i] = p;
                    break;
                }
            }
        }
    }

    public double mean() {                          // sample mean of percolation threshold
        double avg = StdStats.mean(prob);
        return avg;
    }

    public double stddev() {                        // sample standard deviation of percolation threshold
        double std = StdStats.stddev(prob);
        return std;
    }

    public double confidenceLo() {                  // low  endpoint of 95% confidence interval
        double margin = 2 * (stddev() / Math.sqrt(trials));
        double confLo = mean() - margin;
        return confLo;
    }

    public double confidenceHi() {                  // high endpoint of 95% confidence interval
        double margin = 2 * (stddev() / Math.sqrt(trials));
        double confHi = mean() - margin;
        return confHi;
    }
}
