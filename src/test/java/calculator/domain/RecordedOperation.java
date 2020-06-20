package calculator.domain;

public class RecordedOperation {
    private final String operation;
    private final String result;

    public RecordedOperation(String operation, String result) {
        this.operation = operation;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public String getResult() {
        return result;
    }
}
