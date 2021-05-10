package ResponsibilityPatternPackage;

public class Yingzhang extends Officer {
    public Yingzhang(String name) {
        super(name);
    }

    @Override
    public void handle(Mission mission) {
        if (mission.getNum()>=50&&mission.getNum()<200){
            System.out.println("营长下达作战指令！");
        }
        else if (mission.getNum()>=200){
            System.out.println("需要开会讨论在下达作战指令！");
        }
        }
    }
