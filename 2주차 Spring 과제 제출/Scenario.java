
public class Scenario {
    public static void main(String[] args) {
//      Bus 의 초기설정 ↓-------------------------------------------------------------------------------------------------
        Bus bus1 = new Bus(1); //1. 버스1 의 번호 값을 bus1로 가리키기
        Bus bus2 = new Bus(2); //1. 버스2 의 번호 값을 bus2로 가리키기
        bus1.busName = "버스1"; //1. 버스1에 이름 붙이기
        bus2.busName = "버스2"; //1. 버스2에 이름 붙이기
        bus1.fuel += 100; //버스1의 초기 연료량100 설정
        bus2.fuel += 100; //버스2의 초기 연료량100 설정
        bus1.maxPassenger = 30; //버스1의 최대 수용할 수 있는 승객수 30 설정
        bus2.maxPassenger = 30; //버스2의 최대 수용할 수 있는 승객수 30 설정
        bus1.driveState = 1;//버스1의 초기 운행상태를 '운행' 으로 설정
        bus2.driveState = 2;//버스2의 초기 운행상태를 '운행' 으로 설정

        System.out.println(bus1.number + "번 버스의 이름은 " + bus1.busName + " 입니다."); //2. 버스1의 번호와 이름 출력
        System.out.println(bus2.number + "번 버스의 이름은 " + bus2.busName + " 입니다."); //2. 버스2의 번호와 이름 출력

//      Bus 의 시나리오 ↓-------------------------------------------------------------------------------------------------
        bus1.justRidePassenger += 2; //1. 승객 +2
        bus1.busFee = 2000; //요금 계산

        bus1.currentPassenger(); //2-a,b,c 탑승승객수 잔여승객수 요금확인 출력
        bus1.surplusPassenger(); //2-a,b,c 탑승승객수 잔여승객수 요금확인 출력
        System.out.println("요금은 " + bus1.busFee + "원 입니다."); //2-a,b,c 탑승승객수 잔여승객수 요금확인 출력

        bus1.fuel -= 50; //3. 주유량 -50
        bus1.fuelCheck(); //4. 버스1의 남은 연료량 확인하기

        bus1.driveState = 0; //5. 버스의 상태를 '차고지행' 으로 변경

        bus1.fuel += 10; //6. 주유량 +10

        bus1.stateAndFuelCheck(); //7-a,b 상태=차고지행 주유량 출력

        bus1.driveState = 1; //8. 운행중 으로 상태 변경

        bus1.justRidePassenger += 45; //9. 승객 +45

        bus1.currentPassenger(); //10. 알럿 최대 승객 수 초과 띄우기

        bus1.justRidePassenger = 5; //11. 승객+5 이긴한데 제시된 문제에서 다음 12번 시나리오가 탑승객수 출력인데 5로 되어있더라. 47명 어디감? 그래서 걍 5대입함
        bus1.busFee = 5000; // 요금 계산

        bus1.currentPassenger(); //12-a,b,c 탑승승객수 잔여승객수 요금확인 출력
        bus1.surplusPassenger(); //12-a,b,c 탑승승객수 잔여승객수 요금확인 출력
        System.out.println("요금은 " + bus1.busFee + "원 입니다."); //12-a,b,c 탑승승객수 잔여승객수 요금확인 출력

        bus1.fuel -= 55; //13. 주유량-55

        bus1.driveState = 0; //상태=차고지행으로 변경
        bus1.stateAndFuelCheck(); //14-a,b 주유량=5 상태=차고지행 출력

        System.out.println(bus1.busName + "의 연료량이 적습니다. 주유가 필요합니다."); //15. 알럿 주유 필요 띄우기






































//      Taxi의 초기설정 ↓-------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Taxi taxi1 = new Taxi(1); //1. 택시1 의 번호 값을 taxi1로 가리키기
        Taxi taxi2 = new Taxi(2); //1. 택시1 의 번호 값을 taxi1로 가리키기
        taxi1.taxiName = "택시1"; //1. 택시1에 이름 붙이기
        taxi2.taxiName = "택시2"; //1. 택시2에 이름 붙이기
        taxi1.fuel = 100; //택시1의 초기 연료량 100 설정
        taxi2.fuel = 100; //택시2의 초기 연료량 100 설정
        taxi1.taxiState = 1; //택시1의 초기 상태가 '일반' 설정
        taxi2.taxiState = 1; //택시2의 초기 상태가 '일반' 설정
        taxi1.maxPassenger = 4; //택시1의 최대 승객 수용량 설정
        taxi2.maxPassenger = 4; //택시2의 최대 승객 수용량 설정
        taxi1.defaultTaxiFee = 3000; //택시1의 기본요금 설정
        taxi2.defaultTaxiFee = 3000; //택시2의 기본요금 설정
        taxi1.feePerDistance = 1000; //택시1의 거리당 요금 설정
        taxi2.feePerDistance = 1000; //택시2의 거리당 요금 설정
        taxi1.destiDistance = 1; //택시1의 기본 거리 1 설정
        taxi2.destiDistance = 1; //택시1의 기본 거리 1 설정

        System.out.println(taxi1.number + "번 택시의 이름은 " + taxi1.taxiName + " 입니다."); //2-a. 택시1의 번호와 이름 출력
        System.out.println(taxi2.number + "번 택시의 이름은 " + taxi2.taxiName + " 입니다."); //2-a. 택시2의 번호와 이름 출력
        taxi1.taxiFuelCheck(); //2-b. 주유량 = 100 확인
        taxi1.taxiStateCheck(); //2-c. 상태 = 일반 확인

//      Taxi 의 시나리오 ↓------------------------------------------------------------------------------------------------
        taxi1.taxiPassenger = 2; //1-a 승객+2
        taxi1.destination = "서울역"; //1-b 목적지=서울역
        taxi1.destiDistance = 2; //1-c 목적지까지의 거리 = 2km

        taxi1.taxiState = 2; //택시 상태가 운행중으로 변경
        taxi1.taxiSumFee += ((taxi1.destiDistance - taxi1.defaultDistance) * taxi1.feePerDistance) + taxi1.defaultTaxiFee; //누적 요금량 계산
        taxi1.taxiCurrentPassengerCheck(); //2-a 탑승 승객 수 = 2 확인
        taxi1.taxiSurplusPassengerCheck(); //2-b 잔여 승객수 = 2 확인
        taxi1.taxiDefaultFeeCheck(); //2-c 기본 요금 확인 = 3000 확인
        taxi1.taxiDestinationCheck(); //2-d 목적지 = 서울역 확인
        taxi1.taxiDestiDistanceCheck(); //2-e 목적지까지 거리 = 2km 확인
        taxi1.taxiFeeCheck(); //2-f 지불할 요금 = 4000 확인
        taxi1.taxiStateCheck(); //2-g 상태 = 운행중 확인

        taxi1.fuel -= 80; //3. 주유량 -80

        //4. 요금결제 이건 머임?

        taxi1.taxiFuelCheck(); //5-a 주유량 = 20 확인
        taxi1.taxiSumFeeCheck(); //5-b 누적 요금 = 4000 확인

        taxi1.taxiPassenger += 5; //6. 승객 +5

        taxi1.taxiCurrentPassengerCheck(); //7. 알럿 최대 승객 수 초과

        taxi1.taxiPassenger = 3; //8-a 승객+3
        taxi1.destination = "구로디지털단지역"; //8-b 목적지 = 구로디지털단지역 설정
        taxi1.destiDistance = 12; //8-c 목적지까지 거리 = 12km 설정
        taxi1.taxiSumFee += ((taxi1.destiDistance - taxi1.defaultDistance) * taxi1.feePerDistance) + taxi1.defaultTaxiFee; //누적 요금량 계산

        taxi1.taxiCurrentPassengerCheck(); //9-a 탑승 승객수 = 3 확인
        taxi1.taxiSurplusPassengerCheck(); //9-b 잔여 승객 수 = 1 확인
        taxi1.taxiDefaultFeeCheck(); //9-c 기본 요금 확인 = 3000
        taxi1.taxiDestinationCheck(); //9-d 목적지 = 구로디지털단지역 확인
        taxi1.taxiDestiDistanceCheck(); //9-e 목적지까지 거리 = 12km 확인
        taxi1.taxiFeeCheck(); //9-f 지불할 요금 = 14000 확인

        taxi1.fuel -= 20; //10. 주유량 -20

        //11. 요금결제 이거 머냐구

        taxi1.taxiState = 0; //택시 상태를 운행불가 상태로
        taxi1.taxiFuelCheck(); //12-a 주유량 = 0 확인
        taxi1.taxiStateCheck(); //12-b 상태 = 운행불가 확인
        taxi1.taxiSumFeeCheck(); //12-c 누적 요금 = 19000원 확인 근데 4000 + 14000 은 18000원인데 왜 19000원?

        //13. 12번에서 주유 필요 알럿 같이 울림


    }
}
