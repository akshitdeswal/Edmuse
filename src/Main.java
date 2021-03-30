import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> grades = new TreeMap<>();
        grades.put("COMP 1007", 100);
        grades.put("COPR 1002", 89);
        grades.put("COMP 1009", 75);
    for (String key: grades.keySet())
        System.out.printf("%s -> %d %n",key, grades.get(key));
    }
}
