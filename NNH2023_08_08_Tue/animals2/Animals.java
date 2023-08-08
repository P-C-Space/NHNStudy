package NNH2023_08_08_Tue.animals2;

public interface Animals {
    public default String type() {
        return this.getClass().getSimpleName();
    }

    public boolean canfly();
    public boolean canswim();
}
