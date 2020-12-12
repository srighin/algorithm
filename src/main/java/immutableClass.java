import java.util.HashMap;
import java.util.Map;

public final class immutableClass {
    private final Integer id;
    private final String name;
    private final HashMap<String, Integer> lookup;

    public immutableClass(Integer id, String name, HashMap<String, Integer> looku) {
        this.id = id;
        this.name = name;

        //Deep cloning
        HashMap temp = new HashMap();
        for(Map.Entry<String, Integer> entry : looku.entrySet()){
            temp.put(entry.getKey(), entry.getValue());
        }
        this.lookup = temp;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getLookup() {
        return (Map<String, Integer>) lookup.clone();
    }
}
