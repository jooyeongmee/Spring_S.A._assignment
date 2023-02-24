public class Bus{

    String id;
    int MAX_CUSTOMERNUM;
    int fuel;
    int currentSpeed;
    boolean state;
    int customerNum;
    final int COST = 1000;
    Bus() {
        UUIDgeneration uuid = new UUIDgeneration();
        this.id = uuid.getUUID();
        this.fuel = 100;
        this.currentSpeed = 0;
        this.customerNum = 0;
        this.MAX_CUSTOMERNUM = 30;
        this.state = true;
    }

    void getOn(int num, int money) {
        if (this.state == false) {
            System.out.println("아직 운행중이 아닙니다.");
            return;
        }
        if(customerNum + num > MAX_CUSTOMERNUM){
            System.out.println("최대 승객 수 초과");
            return;
        }

        if (money == num * COST) {
            customerNum += num;
            displayBus(money);

        } else {
            System.out.println("요금이 부족합니다.");
        }

    }

    void drive() {
        this.state = true;
        System.out.println("운행합니다.");
    }
    void terminate() {
        this.state = false;
        System.out.println("운행이 종료됩니다.");
    }

    void changeSpeed(int speed) {
        if (fuel > 10) {
            currentSpeed = speed;
            System.out.println("현재 운행 속도는 " + currentSpeed + "입니다.");
        } else {
            System.out.println("주유량을 확인해 주세요.");
        }
    }
    void changeState() {
        if (fuel < 10) {
            System.out.println("주유가 필요합니다.");
        }
        this.state = !state;
        System.out.println("현재 상태는 " + (state ? "운행 중" : "차고지행 중") + "입니다.");
    }

    void displayBus(int money) {
        System.out.println("탑승 승객 수=" + this.customerNum);
        System.out.println("잔여 승객 수=" + (MAX_CUSTOMERNUM - customerNum));
        System.out.println("요금 확인=" + money);
    }
}