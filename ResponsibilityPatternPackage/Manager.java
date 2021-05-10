package ResponsibilityPatternPackage;
/*
具体处理者Manager（经理类
Manager类是具体处理者，他是抽象处理者的子类，实现了在抽象处理者中定义的抽象处理方法，如果封装在请求对象request中的请假
时间小于10天，则他可以直接处理，否则将请求转发给下家（上层领导successor）处理
 */
public class Manager extends Leader{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleeRequset(LeaveRequest request) {
        if (request.getLeaveDays()<10){
            System.out.println("经理" + name + "审批员工" + request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays()+ "天");
        }
        else {
            if (this.successor != null){
                this.successor.handleeRequset(request);
            }
        }
    }
}
