package ch4;

public class Main {
    public static void main(String[] args) {
        String[] userNames = {"Tom","Jerry"};
        Team team2 = new Team(userNames);
       team2.modifyName(0,"Jack");
       for(String n:userNames){
           System.out.println(n);
       }

    }
}
class Team{
    String[] names;

    public Team(String... names) {
        this.names = names;
    }
    public void modifyName(int i,String n){
        names[i] = n;
    }
}
