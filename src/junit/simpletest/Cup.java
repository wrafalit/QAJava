package junit.simpletest;

public class Cup {
    private String liquidType;
    private double percentFull;

    public Cup(String liquidType, double percentFull) {
        this.liquidType = liquidType;
        this.percentFull = percentFull;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public double getPercentFull() {
        return percentFull;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public void setPercentFull(double percentFull) {
        this.percentFull = percentFull;
    }
}
