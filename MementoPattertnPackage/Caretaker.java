package MementoPattertnPackage;

/**
 * Caretaker是负责人类，它负责保存备忘录，并提供getMemento()方法用于获取存储在其中的备忘录，提供setMemento()方法用于设置
 * 或添加新的备忘录。
 */
public class Caretaker {
    private Memento memento;
    public Memento getMemento(){
        return memento;
    }
    public void setMemento(Memento memento){
        this.memento = memento;

    }
}
