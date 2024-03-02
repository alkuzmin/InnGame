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
        if (name == null || name.isEmpty()) raise new IllegalArgumentException()
        this.name = name;
    }



}
