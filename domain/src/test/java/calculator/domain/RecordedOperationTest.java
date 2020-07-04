package calculator.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordedOperationTest {

    @Test
    public void shouldPrintRecordedOperationsInAReadableFormat() {

        RecordedOperation operation = new RecordedOperation("2 + 3", "5");

        assertThat(operation.toString()).isEqualTo("2 + 3 = 5");
    }
}
