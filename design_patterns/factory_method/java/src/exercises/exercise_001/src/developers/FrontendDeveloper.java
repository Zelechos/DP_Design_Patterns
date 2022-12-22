package exercises.exercise_001.src.developers;

import java.util.ArrayList;
import java.util.List;

public class FrontendDeveloper implements Developer{
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
        return "Alex";
    }

    @Override
    public String setLastName() {
        return "LanCaster";
    }

    @Override
    public String setAge() {
        return "26";
    }
}
