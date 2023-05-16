package chapt_01;

public class _05_ValuableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 ( 공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한단어 이상 두 개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
        // 6. 예약어 사용 불가
            /*- public
            - static
            - void
            - int
            - double
            - float ...*/
        String nationality = "대한민국";
        String firstName = "현성";
        String lastName = "kim";
        String dateOfBirth = "2001-12-31";
        String residentialAddress = "Samsung Hotel";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";

    }
}