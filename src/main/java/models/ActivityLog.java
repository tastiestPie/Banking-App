package models;
import java.time.LocalDate;

public class ActivityLog {
    public static enum ActionType {WIRE_TRANSFER, FREEZING, UNFREEZING, CREATE_NOTE, VIEW_CUSTOMER_ACCOUNT};
    private int logId;
    private int empId;
    private String action;
    private LocalDate date;

    public ActivityLog(int logId, int empId, String action, LocalDate date) {
        this.logId = logId;
        this.empId = empId;
        this.action = action;
        this.date = date;
    }

    // Getters and Setters
    public int getLogId() { return logId; }
    public int getEmpId() { return empId; }
    public String getAction() { return action; }
    public LocalDate getDate() { return date; }
}
