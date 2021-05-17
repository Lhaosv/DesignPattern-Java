package CommandPatternPackage;

/**
 * 具体命令类TvOpenCommand（电视机打开命令类）
 * TvOpenCommand类实现了抽象命令接口IAbstactCommand,并实现了在IAbstactCommand中声明的execute()方法，在TvOpenCommand中
 * 定义了Television类中的成员变量tv，用于调用请求接收者Televison类中的open()方法。
 */
public class TvOpenCommand implements IAbstactCommand{
    private Television tv;

    public TvOpenCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.open();
    }
}
