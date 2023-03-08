package example;

public class Record {

    private static Record instance;

    public String log;

    private Record(String log) {
    }

    public static Record getInstance(String log) {
        if (instance == null) {
            instance = new Record(log);
        }
        return instance;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getLog(){
        return this.log;
    }
}
