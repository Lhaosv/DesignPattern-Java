package CommandPatternPackage;

public class Client {
    public static void main(String[] args) {
        IAbstactCommand openCommand,closeCommand,changeCommand;

        openCommand = new TvOpenCommand();
        closeCommand = new TvCloseCommand();
        changeCommand = new TvChangeCommand();

        Controller controller = new Controller(openCommand,closeCommand,changeCommand);

        controller.open();
        controller.change();
        controller.close();

    }
}
