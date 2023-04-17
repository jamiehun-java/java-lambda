package ch16.sec02.exam02;

public class ButtionExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        btnOk.setClickListener(() -> {
            System.out.println("Click Ok Button");
        });

        btnOk.click();

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        btnCancel.setClickListener(() -> {
            System.out.println("Click Cancel Button");
        });

        btnCancel.click();
    }
}
