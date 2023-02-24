import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();
        Bus new_bus = new Bus();
        System.out.println("첫번째 버스의 아이디는 " + bus.id + "입니다.");
        System.out.println("두번째 버스의 아이디는 " + new_bus.id + "입니다.");

        bus.drive();
        bus.getOn(2, 2000);
        bus.getOn(3, 2000);
        bus.getOn(3, 3000);
        bus.getOn(30, 2000);

        bus.fuel -= 50;
        System.out.println("현재 주유량은 " + bus.fuel + "입니다.");

        bus.changeSpeed(30);

        bus.changeState();
        bus.getOn(2, 2000);

        bus.drive();
        bus.getOn(2, 2000);

        bus.fuel -= 50;
        System.out.println("현재 주유량은 " + bus.fuel + "입니다.");

        bus.changeSpeed(30);

        bus.terminate();

    }
}

