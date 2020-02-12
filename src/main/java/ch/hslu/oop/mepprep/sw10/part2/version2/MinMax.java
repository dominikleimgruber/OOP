package ch.hslu.oop.mepprep.sw10.part2.version2;

public enum MinMax {
    MIN("min"),
    MAX("max");

    private String stringValue;


    private MinMax(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
