package week_4;
import java.util.Scanner;
class Engine
{
    int id, power;
    String type;
    float weight;
    public void setEngine(int id, String type, int power, float weight)
    {
        this.id = id;
        this.type = type;
        this.power = power;
        this.weight = weight;
    }
    public void getEngine(int id, String type, int power, float weight)
    {
        System.out.println(id+"\n"+type+"\n"+power+"\n"+weight);
    }
}
class Demo
{
    public static void main(String[] args)
    {
        week_4.Engine e = new week_4.Engine();
        Scanner scan = new Scanner (System.in);
        int id = scan.nextInt();
        int power = scan.nextInt();
        float weight = scan.nextFloat();
        String type = scan.next();
        e.setEngine(id,type,power,weight);
        e.getEngine(id,type,power,weight);
        scan.close();
    }
}
public class Pg_68 {
}
