package ResponsibilityPatternPackage;
/*
请求类LeaveRequest(请假条类)
 */
public class LeaveRequest {
    private String leaveName;
    private int leaveDays;

    public LeaveRequest() {
    }

    public LeaveRequest(String leaveName, int leaveDays) {
        this.leaveName = leaveName;
        this.leaveDays = leaveDays;
    }

    public String getLeaveName() {
        return (this.leaveName);
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public int getLeaveDays() {
        return (this.leaveDays);
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
