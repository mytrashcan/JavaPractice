package chapter02;

// 예제 2-9
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5;
        // 삼항 연산자 예제
        System.out.println("두 수의 차는 " + ((a>b)?a-b:b-a));
    }
}
