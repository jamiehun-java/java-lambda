package ch16.sec05.exam02;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 정적 메서드일 경우
        person.action(Computer::staticMethod);

        // 인스턴스 메서드일 경우
        Computer computer = new Computer();
        person.action(computer::instanceMethod);
    }
}
