import javax.swing.JOptionPane;
public class Bus extends PublicTransport {
    int busFee; //버스 요금
    int driveState; //버스 운행 상태여부 (0:차고지행 1:운행)
    int justRidePassenger; //현재 승객 수
    String busName; // 버스 이름


    public Bus(int number) { //버스 번호
        super(number);
    }


    public void currentPassenger() { // 버스의 현재 탑승객 수를 확인하는 메소드
        if (justRidePassenger > 30) { // 탑승제한 30명을 초과함
            System.out.println("현재 " + busName + "의 탑승 승객 수는 " + justRidePassenger + "명 으로 " + (justRidePassenger-30) + "명 만큼 초과 했습니다.");
            JOptionPane.showMessageDialog(null, "탑승 제한 30명을 초과했습니다.");
        }
        else { // 탑승여유있음
            System.out.println("현재 " + busName + "의 탑승 승객 수는 " + justRidePassenger + "명 입니다.");
        }

    }

    public void surplusPassenger() { // 버스의 잔여석을 확인하는 메소드
        System.out.println("현재 " + busName + "의 잔여 자리 수는 " + (maxPassenger-justRidePassenger) + " 입니다.");
    }

    public void fuelCheck() { // 버스의 연료량을 확인하는 메소드
        System.out.println("현재 " + busName + "의 연료량은 " + fuel + " 입니다.");
    }

    public void stateAndFuelCheck() { // 버스의 상태와 연료량을 동시에 확인하는 메소드
        if (driveState == 0) { // 상태가 차고지행 일경우
            System.out.println("현재 " + busName + "의 상태는 '차고지행' 이며, 연료량은 " + fuel + " 입니다.");
        }
        else {// 상태가 운행중 일경우
            System.out.println("현재 " + busName + "의 상태는 '운행중' 이며, 연료량은 " + fuel + " 입니다.");
        }

    }
}