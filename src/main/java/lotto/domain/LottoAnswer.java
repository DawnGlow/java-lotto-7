package lotto.domain;

import java.util.List;

public class LottoAnswer {
    public LottoAnswer(List<Integer> numbers) {
        validate(numbers);
        validateNumberRange(numbers);
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
}
