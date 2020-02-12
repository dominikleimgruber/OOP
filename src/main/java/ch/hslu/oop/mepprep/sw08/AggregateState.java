package ch.hslu.oop.mepprep.sw08;

public enum AggregateState {

    SOLID("solid"), LIQUID("liquid"), GAS("gas");
    private String stringValue;

    private AggregateState(final String stringValue){
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
