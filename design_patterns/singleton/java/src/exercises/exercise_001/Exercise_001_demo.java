package exercises.exercise_001;

import exercises.exercise_001.src.factory.*;

public class Exercise_001_demo {

    private static Engineer ing;

    public static void main(String[] args) {
        configuration();
        run();
    }

    static void configuration() {
        String departament = "mobile";

        if (departament.equals("back")) {
            ing = new BackendEngineer();
        }

        if (departament.equals("front")) {
            ing = new FrontendEngineer();
        }

        if (departament.equals("ia")) {
            ing = new IAEngineer();
        }

        if (departament.equals("devops")) {
            ing = new DevOpsEngineer();
        }

        if (departament.equals("mobile")) {
            ing = new MobileEngineer();
        }
    }

    static void run() {
        ing.render();
    }
}
