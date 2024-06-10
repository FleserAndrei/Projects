package Objects.p2;

public class Main {
    public static void main(String[] args) {

        Tank tank = new Tank();
        tank.Fill(1.5);
        tank.EmptyALL();
        tank = new Tank();
        tank.Fill(3);
        tank = new Tank();
        System.gc();
    }
}
