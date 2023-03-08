package exercises.exercise_001.src.factory;

import exercises.exercise_001.src.developers.DevOpsDeveloper;
import exercises.exercise_001.src.developers.Developer;

public class DevOpsEngineer extends Engineer{
    @Override
    public Developer createDeveloper() {
        return new DevOpsDeveloper();
    }
}
