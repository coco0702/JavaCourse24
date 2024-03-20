package ch4;

public class Rectangle {

    String name;
    double length;
    double width;
    //double area;
   public Rectangle(String n,double l,double w){
       name = n;
       length = l;
       width = w;
   }
   public Rectangle(String n){
       name = n;
   }
    public double getArea(){
        return length * width;
    }
    public void init(String n,double l,double w){
        name = n;
        length = l;
        width = w;
    }
    public String toString(){
        return "name:"+name+",length:"+length+",width:"+width;
    }
}
