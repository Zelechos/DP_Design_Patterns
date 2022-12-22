package exercises.exercise_001.src.factory;

import exercises.exercise_001.src.developers.Developer;
import exercises.exercise_001.src.developers.IADeveloper;

public class IAEngineer extends Engineer {
    @Override
    public Developer createDeveloper() {
        return new IADeveloper();
    }
}
