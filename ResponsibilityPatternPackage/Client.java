package ResponsibilityPatternPackage;

public class Client {
    public static void main(String[] args) {
        Leader objDirector,objManager,objGeneralManager;
        objDirector = new Dircetor("王明");
        objManager = new Manager("赵强");
        objGeneralManager = new GeneraManager("李波");
        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);
        LeaveRequest lr1 = new LeaveRequest("张三",2);
        objDirector.handleeRequset(lr1);
        LeaveRequest lr2 = new LeaveRequest("李四",5);
        objDirector.handleeRequset(lr2);
        LeaveRequest lr3 = new LeaveRequest("王五",15);
        objDirector.handleeRequset(lr3);
        LeaveRequest lr4 = new LeaveRequest("赵六",45);
        objDirector.handleeRequset(lr4);
    }
}
