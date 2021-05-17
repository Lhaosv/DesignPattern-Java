package CommandPatternPackage;

/**
 * Television类是请求的接收者，它实现了具体的业务操作，如open(),close(),changeChannel()方法
 */
public class Television {
    public void open(){
        System.out.println("打开电视机！");
    }

    public void close(){
        System.out.println("关闭电视机！");
    }
    public void changeChannel(){
        System.out.println("切换电视台！");
    }
}
