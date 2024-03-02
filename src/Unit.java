import java.util.HashMap;

public class Unit {

    private Unit(){};
    public Unit(String name)
    {
        this.setName(name);

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

    private HashMap<String, Integer> resources;

    public HashMap<String, Integer> getResources() {
        return resources;
    }

    public void setResources(HashMap<String, Integer> resources) {
        this.resources = resources;
    }
}
