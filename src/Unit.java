import java.sql.SQLOutput;
import java.util.HashMap;

enum ResTypes {GOLD, WATER, FOOD, ENERGY}

public class Unit {

    private Unit(){};
    public Unit(String name)
    {
        this.setName(name);
        this.resources = new HashMap<>();

    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
    }

    private Integer health =100;


    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
       if (health<0 || health>100) throw new IllegalArgumentException();
       this.health = health;
    }

    public void doVoice()
    {
        System.out.println("Iam "+this.name);
    }

    private HashMap<ResTypes, Integer> resources;

    public HashMap<ResTypes, Integer> getResources() {
        return new HashMap<ResTypes, Integer>(this.resources);
    }

    public void setResources(ResTypes restype, Integer val) {
        if (val<0) throw new IllegalArgumentException();
        this.resources.put(restype, val);
    }

    public void printResources()
    {
        this.resources.values().stream().forEach(System.out::println);
    }
}
