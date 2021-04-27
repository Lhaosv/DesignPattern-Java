package FlyweightPatternpackage;

/**
 * 抽象享元类NetworkDevice（网络设备类） 它声明了所有具体享元类共有的方法
 *
 */
public interface NetworkDevice {
    public String getTYpe();
    public void use();
}
