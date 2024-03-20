public class Auxiliar {
    private int numSwaps;
    private int numComparisons;

    public void incrementSwaps() {
        this.numSwaps++;
    }

    public void incrementComparisons() {
        this.numComparisons++;
    }

    public int getNumSwaps() {
        return numSwaps;
    }

    public int getNumComparisons() {
        return numComparisons;
    }

    public void reset() {
        this.numSwaps = 0;
        this.numComparisons = 0;
    }
}