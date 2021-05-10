package ResponsibilityPatternPackage;
/*
抽象处理者Leader(领导类)
leader类是抽象处理者，它定义了一个Leader类型的后继对象successor,作为对下家的引用，同时它定义了抽象请求处理方法handleeRequset（）
 */
public abstract class Leader {
    protected String name;
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }
    public abstract void handleeRequset(LeaveRequest request);
}
