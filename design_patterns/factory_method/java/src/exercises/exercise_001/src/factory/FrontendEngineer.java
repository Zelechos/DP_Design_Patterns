package exercises.exercise_001.src.factory;

import exercises.exercise_001.src.developers.Developer;
import exercises.exercise_001.src.developers.FrontendDeveloper;

public class FrontendEngineer extends Engineer{
    @Override
    public Developer createDeveloper() {
        return new FrontendDeveloper();
    }
}
