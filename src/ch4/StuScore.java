package ch4;

public class StuScore {
    //静态代码块
    static {
        passLine = 60.0;
        System.out.println("This is a static block");
    }
    private String name;
    String id;
    double score;
    private static double passLine;
    public static void init(){
        //name = "zhangsan";
        //printLevel();
    }
    public static void setPassLine(double passLine) {

        StuScore.passLine = passLine;
    }

    public StuScore(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public StuScore(String name, String id, double score) {
        //this.name = name;
        //this.id = id;
        this(name,id);
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printLevel(){
        passLine = 70.0;
        if (score >= passLine){
            System.out.println("Passed");
        }else{
            System.out.println("Unpassed");
        }
    }
}
