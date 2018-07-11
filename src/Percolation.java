
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    /**
     * @param args the command line arguments
     */
    int n;
    WeightedQuickUnionUF a;
    boolean[] b;

    public Percolation(int n) // create n-by-n grid, with all sites blocked
    {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        a = new WeightedQuickUnionUF((n + 1) * (n + 1));
        this.n = n;
        b = new boolean[(n + 1) * (n + 1)];
    }

    public void open(int row, int col) // open site (row, col) if it is not open already
    {
        if (row <= 0 || row > n || col <= 0 || col > n) {
            throw new IllegalArgumentException();
        }

        int k = row * n + col;
        if (b[k] == false) {
            b[k] = true;
        } else {
            return;
        }
        int up = (row - 1) * n + col;
        int down = (row + 1) * n + col;
        int left = row * n + col - 1;
        int right = row * n + col + 1;

        if (b[up] == true) {
            a.union(up, k);
        }
        if (b[down] == true) {
            a.union(down, k);
        }
        if (b[left] == true) {
            a.union(left, k);
        }
        if (b[right] == true) {
            a.union(right, k);
        }
    }

    public boolean isOpen(int row, int col) // is site (row, col) open?
    {
        if (row <= 0 || row > n || col <= 0 || col > n) {
            throw new IllegalArgumentException();
        }
        return b[row * n + col];
    }

    public boolean isFull(int row, int col) // is site (row, col) full?
    {
        if (row <= 0 || row > n || col <= 0 || col > n) {
            throw new IllegalArgumentException();
        }

        if (row == 1) {
            return isOpen(row, col);
        }
        int k = row * n + col;
        for (int i = 1; i <= n; i++) {
            boolean is_open_top = isOpen(1, i);
            int top_idx = 1 * n + i;
            if (is_open_top && a.connected(k, top_idx)) {
                return true;
            }
        }
        return false;
    }

    public int numberOfOpenSites() // number of open sites
    {
        int count = 0;
        for (int i = 1; i < (n+1) * (n+1); i++) {
            if (b[i]) {
                count++;
            }
        }
        return count;
    }

    public boolean percolates() // does the system percolate?
    {
        for (int i = 1; i <= n; i++) {
            if (isFull(n, i)) {
                return true;
            }
        }
        return false;
    }
}
