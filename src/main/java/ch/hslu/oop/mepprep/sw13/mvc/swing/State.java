package ch.hslu.oop.mepprep.sw13.mvc.swing;

public enum State {
    ON(100),
    OFF(200),
    FAILURE(300);

    private int stateCode;
    private State(final int stateCode){
        this.stateCode = stateCode;
    }

    public int getStateCode() {
        return stateCode;
    }
}
