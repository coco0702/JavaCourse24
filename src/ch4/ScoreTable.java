package ch4;

public class ScoreTable {
    private String courseName;
    private String clazz;
    private String teacher;
    private StuScore[] scores;

    public ScoreTable(String courseName, String clazz, String teacher) {
        this.courseName = courseName;
        this.clazz = clazz;
        this.teacher = teacher;
        this.scores = new StuScore[30];
    }
    public void addScore(String id,String name,double score){

    }
    public void addScore(StuScore stuScore){

    }
}
