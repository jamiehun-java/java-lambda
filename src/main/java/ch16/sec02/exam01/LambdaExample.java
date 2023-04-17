package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 1) 실행문이 두 개 이상인 경우 중괄호 필요
        person.action(() -> {
            System.out.println("go to work");
            System.out.println("programming");
        });

        // 2) 실행문이 한 개일 경우 중괄호 생략 가능
        person.action(() -> System.out.println("finish work"));
    }
}
