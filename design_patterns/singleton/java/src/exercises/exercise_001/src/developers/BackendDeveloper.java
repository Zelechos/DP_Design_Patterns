package exercises.exercise_001.src.developers;

import java.util.ArrayList;
import java.util.List;

public class BackendDeveloper implements Developer{
    @Override
    public List<String> showDeveloper() {
        List<String> data = new ArrayList<>();
        data.add(setName());
        data.add(setLastName());
        data.add(setAge());
        return data;
    }

    @Override
    public String setName() {
        return "Rodrigo";
    }

    @Override
    public String setLastName() {
        return "De Paul";
    }

    @Override
    public String setAge() {
        return "27";
    }
}
