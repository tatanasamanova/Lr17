import java.util.ArrayList;
import java.util.List;

abstract class Logistic {
    String Transport;
    List<String> accessories=new ArrayList();
    public String toString(){
        return "Type of transportation:" + "Transport /N"+ accessories;

    }
}
abstract class LogisticFactory{
    public abstract Logistic createLogistic();
}
class RoadLogisticFactory extends LogisticFactory {
    public Logistic createLogistic(){
        return new RoadLogistic();
    }}
class AirLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new AirLogistic();
    }}
class SeaLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new SeaLogistic();
    }}

class RoadLogistic extends Logistic{
    public RoadLogistic(){
        Transport="RoadLogistic";
        accessories.add("Capacity in tons");//Вместимость в тоннах
        accessories.add("Fuel consumption");//Расход топлива
        accessories.add("Travel time");//Время в пути
        accessories.add("Navigation system");//Система навигации
    }
}
class AirLogistic extends Logistic{
    public AirLogistic(){
        Transport="AirLogistic";
        accessories.add("Capacity in tons");//Вместимость в тоннах
        accessories.add("Fuel consumption");//Расход топлива
        accessories.add("Travel time");//Время в пути
        accessories.add("Navigation system");//Система навигации a
    }
}
class SeaLogistic extends Logistic{
    public SeaLogistic(){
        Transport="SeaLogistic";
        accessories.add("Capacity in tons");//Вместимость в тоннах
        accessories.add("Fuel consumption");//Расход топлива
        accessories.add("Travel time");//Время в пути
        accessories.add("Navigation system");//Система навигации
    }
}

     public class Main{
    public static void main(String args[]){
        LogisticFactory myRoadFactory=new RoadLogisticFactory();
        LogisticFactory myAirFactory=new AirLogisticFactory();
        LogisticFactory mySeaFactory=new SeaLogisticFactory();
        Logistic myRoadLogistic=myRoadFactory.createLogistic();
        Logistic myAirLogistic=myAirFactory.createLogistic();
        Logistic mySeaLogistic=mySeaFactory.createLogistic();
        System.out.println(myRoadLogistic);
        System.out.println(myAirLogistic);
        System.out.println(mySeaLogistic);
    }
}

