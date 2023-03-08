package exercises.exercise_001.src.developers;

import java.util.ArrayList;
import java.util.List;

public class DevOpsDeveloper implements Developer {

    @Override
    public List<String> showDeveloper() {
        List<String> data = new ArrayList<>();
        data.add(setName());
        data.add(setLastName());
        data.add(setAge());
        data.add("position : DevOps Engineer");
        data.add("level : SemiSenior");
        data.add("technologies : [Docker, Kubernetes, Python, Serveless]");
        data.add("company: AWS");
        return data;
    }

    @Override
    public String setName() {
        return "Julian";
    }

    @Override
    public String setLastName() {
        return "Alvarez";
    }

    @Override
    public String setAge() {
        return "22";
    }
}
