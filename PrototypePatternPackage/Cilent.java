package PrototypePatternPackage;

/**
 * 客户端测试类
 */
public class Cilent {
    public static void main(String[] args) {
        Email email,copyEmail;
        email = new Email();
        copyEmail = (Email)email.clone();
        System.out.println("email==copyEmail?");
        System.out.println(email==copyEmail);
        System.out.println("email.getAttachment==copyEmail.getAttachment?");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());

    }
}
