package exercises.exercise_001.src.factory;

import exercises.exercise_001.src.developers.BackendDeveloper;
import exercises.exercise_001.src.developers.Developer;

public class BackendEngineer extends Engineer{
    @Override
    public Developer createDeveloper() {
        return new BackendDeveloper();
    }
}
