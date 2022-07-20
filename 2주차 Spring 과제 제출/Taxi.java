import javax.swing.JOptionPane;
public class Taxi extends PublicTransport{
    String destination; //목적지
    int destiDistance; //목적지까지 거리
    int defaultDistance; //기본 거리
    int defaultTaxiFee; //기본 요금
    int feePerDistance; //거리당 요금
    int taxiState; //상태 (0:운행불가 1:일반 2:운행중)
    String taxiName; // 택시 이름
    int taxiPassenger; //택시 탑승객
    int taxiSumFee; //누적 요금량


    public Taxi(int number) {//택시 번호
        super(number);
    }


    public void taxiFuelCheck() {
        if (fuel < 0) { //연료 없음
            System.out.println(taxiName + "의 남은 연료량은 " + fuel + " 입니다. 주유가 필요합니다.");
            JOptionPane.showMessageDialog(null, "남은 연료가 별로 없습니다. 주유가 필요합니다.");
        }
        else { //연료 충분
            System.out.println(taxiName + "의 남은 연료량은 " + fuel + " 입니다.");
        }

    }



    public void taxiCurrentPassengerCheck() { //탑승 승객 수 확인
        if (taxiPassenger > maxPassenger) {// 현재 탑승객이 수용량을 초과함
            System.out.println("현재 탑승 승객 수는 " + taxiPassenger + "명 으로 " + (taxiPassenger - maxPassenger) + "명 초과입니다.");
            JOptionPane.showMessageDialog(null, "최대 탑승 승객 수를 초과 했습니다.");
        }
        else { //자리 여유 있음
            System.out.println("현재 " + taxiName + "의 탑승 승객 수는 " + taxiPassenger + "명 입니다.");
        }
    }

    public void taxiSurplusPassengerCheck() { //남은 자리 확인
        System.out.println("현재 " + taxiName + "의 남은 자리는 " + (maxPassenger - taxiPassenger) + "명 입니다.");
    }

    public void taxiDefaultFeeCheck() { //기본요금 확인
        System.out.println("택시의 기본 요금은 " + defaultTaxiFee + "원 입니다.");
    }


    public void taxiDestinationCheck() { //목적지 확인
        System.out.println(taxiName + "의 목적지는 " + destination + " 입니다.");
    }


    public void taxiDestiDistanceCheck() { //목적지까지 거리 확인
        System.out.println(taxiName + "의 목적지인 " + destination + " 까지의 거리는 " + destiDistance + "KM 입니다.");
    }


    public void taxiFeeCheck() { //최종 지불할 금액 확인
        System.out.println("목적지에 도착하기 위해 지불해 해야할 요금 합은 " + (((destiDistance-1) * feePerDistance) + defaultTaxiFee) + "원 입니다.");
    }


    public void taxiStateCheck() { //택시 상태 확인
        if (taxiState == 0) { //운행불가
            System.out.println("현재 " + taxiName + "의 상태는 '운행불가' 입니다.");
        }
        else {
            if (taxiState == 1) { //일반
                System.out.println("현재 " + taxiName + "의 상태는 '일반' 입니다.");
            }
            else { //운행중
                System.out.println("현재 " + taxiName + "의 상태는 '운행중' 입니다.");
            }
        }

    }


    public void taxiSumFeeCheck() { //누적 요금량 확인
        System.out.println("누적된 요금량은 " + taxiSumFee + "원 입니다.");
    }

}
