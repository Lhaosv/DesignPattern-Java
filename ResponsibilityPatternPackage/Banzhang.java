package ResponsibilityPatternPackage;

public class Banzhang extends Officer{
    public Banzhang(String name) {
        super(name);
    }

    @Override
    public void handle(Mission mission) {
        if (mission.getNum()<10){
            System.out.println("班长下发作战指令！");
        }
        else {
            if(this.successor!=null){
                this.successor.handle(mission);

            }

        }
    }
}
