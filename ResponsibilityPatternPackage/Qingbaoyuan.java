package ResponsibilityPatternPackage;

public class Qingbaoyuan {
    public static void main(String[] args) {
        Officer banzhang,paizhang,yingzhang;
        banzhang = new Banzhang("班长");
        paizhang = new Paizhang("排长");
        yingzhang = new Yingzhang("营长");
        banzhang.setSuccessor(paizhang);
        paizhang.setSuccessor(yingzhang);
        Mission m1 = new Mission(6);
        banzhang.handle(m1);
        Mission m2 = new Mission(30);
        banzhang.handle(m2);
        Mission m3 = new Mission(100);
        banzhang.handle(m3);
        Mission m4 = new Mission(300);
        banzhang.handle(m4);
    }
}
