import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        Unit u1 = new Unit("ork1");
        u1.setHealth(90);
        u1.doVoice();
        //u1.getResources().put(ResTypes.FOOD, -100); !!!
        u1.setResources(ResTypes.GOLD,20);
        u1.setResources(ResTypes.ENERGY,67);
        u1.printResources();
        }
    }
