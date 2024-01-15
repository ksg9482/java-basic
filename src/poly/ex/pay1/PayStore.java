package poly.ex.pay1;

public abstract class PayStore {
    //결제수단 보관 관리
    
    //변하는 부분
    public static Pay findPay(String option) {
        //payservice에 두면 추가될 때 마다 payservice를 수정해야 함.
        //결제수단 선택과 결제실행이 분리되었음 -> 따로 뽑아낼 수 있게되었다는 뜻
        if (option.equals("kakao")) {
            return new KakaoPay(); //굳이 변수선언 안하고 바로 리턴한다.
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            System.out.println("결제 수단이 없습니다.");
            return new DefaultPay(); //null이 아니라 항상 실패하는 인스턴스 반환. 인스턴스를 반환하는 게 보장됨
        }
    }
}
