import java.util.TreeMap;

public class Processes {
    String name;
    TreeMap<Activities,String> setActivities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeMap<Activities, String> getSetActivities() {
        return setActivities;
    }

    public void setSetActivities(TreeMap<Activities, String> setActivities) {
        this.setActivities = setActivities;
    }

    public Processes(){
        this.name=name;
        this.setActivities=setActivities;
    }
    //crear procesos
    //eliminar procesos
    //editar procesos
}
