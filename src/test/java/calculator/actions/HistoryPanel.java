package calculator.actions;

import org.openqa.selenium.By;

public class HistoryPanel {
    public static final By HISTORY_ROWS = By.cssSelector(".table tbody tr");
    public static final By EXPRESSION = By.cssSelector("td:nth-child(2)");
    public static final By RESULT = By.cssSelector("td:nth-child(3)");
}
