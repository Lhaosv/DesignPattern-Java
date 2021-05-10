package ResponsibilityPatternPackage;
/*
具体处理者GeneraManager（总经理类）
Manager类是具体处理者，他是抽象处理者的子类，实现了在抽象处理者中定义的抽象处理方法，如果封装在请求对象request中的请假
时间小于30天，则他可以直接处理，否则将提示相应的信息
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
