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

        // 3. 입력값 파싱 후 검증 수행
        String[] names = parseNames(Input);
        int attempts = parseAttempts(attemptsInput);
    }

    private static String[] parseNames(String input) {
        if (input == null) throw new IllegalArgumentException("이름 입력이 null입니다.");
        String[] tokens = input.split(",");
        if (tokens.length == 0) throw new IllegalArgumentException("이름을 하나 이상 입력해야 합니다.");

        for (int i = 0; i < tokens.length; i++) {
            String name = tokens[i].trim();
            if (name.isEmpty()) throw new IllegalArgumentException("빈 이름은 허용되지 않습니다.");
            if (name.length() > 5) throw new IllegalArgumentException("이름은 5자 이하여야 합니다.");
            tokens[i] = name;
        }
        return tokens;
    }


    private static int parseAttempts(String input) {
        if (input == null) throw new IllegalArgumentException("시도 횟수 입력이 null입니다.");
        String s = input.trim();
        try {
            int value = Integer.parseInt(s);
            if (value < 1) throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            return value;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 정수여야 합니다.");
        }
    }
}
