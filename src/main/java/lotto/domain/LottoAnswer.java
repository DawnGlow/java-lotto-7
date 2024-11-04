package lotto.domain;

import java.util.List;

public class LottoAnswer {
    private final List<Integer> numbers;

    public LottoAnswer(List<Integer> numbers) {
        validate(numbers);
        validateNumberRange(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호는 6개여야 합니다.");
        }
    }

    private void validateNumberRange(List<Integer> numbers) {
        if (numbers.stream().anyMatch(number -> number < 1 || number > 45)) {
            throw new IllegalArgumentException("[ERROR] 유효한 범위의 숫자가 아닙니다.");
        }
    }

    private boolean contain(Integer number) {
        return numbers.contains(number);
    }
}
