package ch4;

public class BMI {
    String name;
    double height;
    double weight;
    double bmi;
    double highLevel = 24.5;
    double lowLevel = 18.5;
    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public double getBMI(){
        bmi = weight / (height* height);
        return  bmi;
    }
    public String getLevel(){
        getBMI();
        if (bmi > highLevel){
            return "Fat";
        }else if(bmi < lowLevel){
            return "Thin";
        }else{
            return "Normal";
        }
    }
    public String toString(){
        return "name:"+name+",bmi:"+getBMI()+",result:"+getLevel();
    }
}
