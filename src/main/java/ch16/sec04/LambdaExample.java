package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 1) 실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 2) 리턴문이 하나만 있을 경우 => 생략가능
        person.action((x, y) -> (x + y));

        // 3) 리턴문이 하나만 있을 경우 => 메서드 호출
        person.action((x, y) -> sum(x, y));
    }
    public static double sum(double x, double y){
        return (x + y);
    }
}
