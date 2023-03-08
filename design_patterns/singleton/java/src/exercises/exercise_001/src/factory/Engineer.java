package exercises.exercise_001.src.factory;


import exercises.exercise_001.src.developers.Developer;

public abstract class Engineer {

    public void render(){
        Developer dev = createDeveloper();
        System.out.println(dev.showDeveloper());
    }

    public abstract Developer createDeveloper();
}
