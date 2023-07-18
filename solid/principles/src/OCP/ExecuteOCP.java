package OCP;

import OCP.example_001.*;
import OCP.example_002.Android;
import OCP.example_002.ArchLinux;
import OCP.example_002.Fedora;
import OCP.example_002.LinuxKernel;

public class ExecuteOCP {

    public static void main(String[] args) {
//        DevelopSoftware developSoftware = new DevelopGUI();
//        develop(developSoftware, "Javascript");
        executeMachina(new Fedora());
    }

    public static void develop(DevelopSoftware developSoftware, String programmingLanguage){
        if(developSoftware == null) throw new RuntimeException();
        ProgrammingLanguage pl = new ProgrammingLanguage(programmingLanguage, "OOP");
        developSoftware.Coding(pl);
    }

    public static void executeMachina(LinuxKernel distro){
        distro.executeKernel();
    }
}
