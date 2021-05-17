package MementoPattertnPackage;

/**
 * 客户端测试类，在客户端代码中实例化了UserInfoDTO类并通过负责人Caretaker类保存UserInfoDTO对象的状态，在对状态进行修改后
 * 又可以通过Caretaker负责人取出先前保存的状态
 */
public class Cilent {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();
        user.setAccount("zhangsan");
        user.setPassword("123456");
        user.setTelNo("13800000000");
        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());  // 保存备忘录
        System.out.println("---------------");

        user.setPassword("123456789");
        user.setTelNo("139000000000");
        System.out.println("状态二：");
        user.show();
        System.out.println("---------------");


        user.restoreMemento(c.getMemento());  // 从备忘录中恢复
        System.out.println("回到状态一：");
        user.show();
        System.out.println("----------------");
    }
}
