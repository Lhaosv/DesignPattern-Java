package ResponsibilityPatternPackage;

public class Paizhang extends Officer{
    public Paizhang(String name) {
        super(name);
    }

    @Override
    public void handle(Mission mission) {
        if (mission.getNum()>=10&&mission.getNum()<50){
            System.out.println("排长下达作战指令！");
        }
        else {
            if (this.successor!=null){
                this.successor.handle(mission);
            }
        }
    }
}
