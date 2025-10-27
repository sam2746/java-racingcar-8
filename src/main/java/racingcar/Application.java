package racingcar;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
       // 1. 자동차 이름 목록 입력
        System.out.println("경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분됩니다)");
        String input = Console.readLine();

        // 2. 시도 횟수 입력
        System.out.println("1 이상의 시도할 횟수를 입력해주세요");
        String attemptsInput = Console.readLine();
    }
}
