package exercises.exercise_001.src.developers;

import java.util.ArrayList;
import java.util.List;

public class MobileDeveloper implements Developer{
    @Override
    public List<String> showDeveloper() {
        List<String> data = new ArrayList<>();
        data.add(setName());
        data.add(setLastName());
        data.add(setAge());
        data.add("level : Senior");
        data.add("experience : 10 years");
        data.add("technologies : {Android : 4 years, Swift : 3 years, Java : 7 years, Kotlin : 3 years, Dart: 4 years, Flutter: 4 years}");
        return data;
    }

    @Override
    public String setName() {
        return "Erick";
    }

    @Override
    public String setLastName() {
        return "Mataus";
    }

    @Override
    public String setAge() {
        return "30";
    }
}
