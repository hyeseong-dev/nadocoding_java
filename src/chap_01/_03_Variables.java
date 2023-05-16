package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;        // 초기화 하지 않은 채로 변수 선언만
        name = "nadocoding";
        System.out.println(name);
        System.out.println(name + "Hello World");

        // 변수 선언 및 값 할당
        String name1 = "Kim Moon Sam";
        System.out.println(name1);

        // 정수형 타입
        int hour = 15;
        System.out.println(name + "hello world" + hour + "시에 방문 예정입니다. "); // 문자와 정수를 + 연산자와 사용시 문자열로 반환됨.

        // double
        double score = 90.5;
        char grade = 'A'; // 문자 하나만을 표현 할 때 사용.
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score +"점 입니다. ");
        System.out.println("학점은" + grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시헙에 합격했을까요? "+pass);

        double d = 3.14;
        float f = 3.14f;
        double g = 3.123456789;
        float h = 3.123456789f;
        System.out.println(d == f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(10* Math.pow(10,10));
        System.out.println(1.0E11);
        System.out.println(1.0E3);
        System.out.println(1.0E-3);

        long l = 100000000000000000l;
        System.out.println(l);
    }
}