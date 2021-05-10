package ResponsibilityPatternPackage;

public class Dircetor extends Leader{
    public Dircetor(String name) {
        super(name);
    }

    @Override
    public void handleeRequset(LeaveRequest request) {
        if (request.getLeaveDays()<3){
            System.out.println("主任"+name+"审批员工"+request.getLeaveName()+"的请假条，请假天数为"+request.getLeaveDays()+"天");
        }
        else {
            if (this.successor!=null){
                this.successor.handleeRequset(request);
            }
        }
    }
}
