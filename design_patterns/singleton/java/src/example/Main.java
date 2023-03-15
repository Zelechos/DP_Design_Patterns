package example;


public class Main {
    public static void main(String[] args) {

        Record record = Record.getInstance("feat: add create the instance", "45hy2k92");
        record.renderLog();
        System.out.println(record.log);
        System.out.println(record.hashCode);
        System.out.println(record.getLog());
        System.out.println(record.getHashCode());
        record.setLog("link");
        Record record1 = Record.getInstance("fix: fix the data", "jf45094k");
        System.out.println(record1.getLog());
        record1.setLog("doc: update the readme.md");
        record1.setHashCode("fje2958j");
        record1.renderLog();

    }

}
