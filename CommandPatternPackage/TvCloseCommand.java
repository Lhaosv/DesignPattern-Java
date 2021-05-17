package CommandPatternPackage;
/**
 * 具体命令类TvCloseCommand（电视机关闭命令类）
 * TvCloseCommand类实现了抽象命令接口IAbstactCommand,并实现了在IAbstactCommand中声明的execute()方法，在TvCloseCommand中
 * 定义了Television类中的成员变量tv，用于调用请求接收者Televison类中的close()方法。
 */
public class TvCloseCommand implements IAbstactCommand{
    private Television tv;

    public TvCloseCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
