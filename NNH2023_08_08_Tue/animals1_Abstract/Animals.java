package NNH2023_08_08_Tue.animals1_Abstract;

abstract class Animals {
    public String type() {
        return this.getClass().getSimpleName();
    }

    protected abstract boolean canfly();
}
