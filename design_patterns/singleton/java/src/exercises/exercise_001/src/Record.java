package exercises.exercise_001.src;

public class Record {

    private static Record instance;
    public String log;
    public String hashCode;

    private Record(String log, String hashCode) {
        this.log = log;
        this.hashCode = hashCode;
    }

    public static Record getInstance(String log, String hashCode) {
        if (instance == null) {
            instance = new Record(log, hashCode);
        }
        return instance;
    }

    public String getLog() {
        return this.log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public void renderLog(){
        System.out.println(this.hashCode +" "+ this.log);
    }
}
