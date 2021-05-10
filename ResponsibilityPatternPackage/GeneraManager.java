package ResponsibilityPatternPackage;
/*
具体处理者GeneraManager（总经理类）
 */
public class GeneraManager extends Leader{

    public GeneraManager(String name) {
        super(name);
    }

    @Override
    public void handleeRequset(LeaveRequest request) {
        if(request.getLeaveDays()<30){
            System.out.println("总经理" + name + "审批员工" + request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays() + "天");
        }
        else {
            System.out.println("莫非" + request.getLeaveName() + "想辞职，居然请假" + request.getLeaveDays() + " 天");
        }
    }
}