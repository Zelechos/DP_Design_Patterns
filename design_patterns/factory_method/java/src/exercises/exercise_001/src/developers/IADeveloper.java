package exercises.exercise_001.src.developers;

import java.util.ArrayList;
import java.util.List;

import static java.util.UUID.randomUUID;

public class IADeveloper implements Developer {
    @Override
    public List<String> showDeveloper() {
        List<String> data = new ArrayList<>();
        data.add(setName());
        data.add(setLastName());
        data.add(setAge());
        data.add("experience : 15 years");
        data.add("technologies : Python, Pytorch, AWS, Tensorflow, Rust, Git & Github, ");
        String code = "access-code : "+generateCode();
        data.add(code);
        return data;
    }

    public String generateCode(){
        return randomUUID().toString();
    }

    @Override
    public String setName() {
        return "Alan";
    }

    @Override
    public String setLastName() {
        return "Turing";
    }

    @Override
    public String setAge() {
        return "33";
    }
}
