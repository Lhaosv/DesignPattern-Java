package MementoPattertnPackage;

/**
 * 原发器UserInfoDTO（用户信息类）
 * UserInfoDTO类在此充当原发器类，与一般的类相比它增加了两个方法，一个是用于保存备忘录的方法saveMemento(),一个是用于
 * 从备忘录中恢复状态的方法restoreMemento()
 */
public class UserInfoDTO {
    private String account;
    private String password;
    private String telNo;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    //保存备忘录：
    public Memento saveMemento(){
        return new Memento(account,password,telNo);
    }

    //恢复备忘录：
    public void restoreMemento(Memento memento){
        this.account = memento.getAccount();
        this.password = memento.getPassword();
        this.telNo = memento.getTelNo();
    }


    public void show(){
        System.out.println("Account: " + this.account);
        System.out.println("Password " + this.password);
        System.out.println("TelNo " + this.telNo);
    }
}

//  Memento是备忘录
class Memento{
    private String account;
    private String password;
    private String telNo;

    public Memento(String account, String password, String telNo) {
        this.account = account;
        this.password = password;
        this.telNo = telNo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
