package NHN2023_08_04Fri;

public class Range {

    private int lower, upper;

    public Range(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
        classInvariant();
    }

    public void classInvariant(){
        if (this.lower > this.upper) {
            throw new IllegalArgumentException("Range : "+ this.lower + ">" + this.upper);
        }
    }

    public int getLowerBound() {
        return this.lower;
    }

    public int getUpperBound() {
        return this.upper;
    }

    public Range(int upperBound){
        this(0,upperBound);
    }

}
