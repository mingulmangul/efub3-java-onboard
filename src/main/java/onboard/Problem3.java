package onboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers) {
        List<Integer> answer = new ArrayList<>();
        Collections.sort(numbers);  // 중앙값을 구하기 위한 오름차순 정렬
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        answer.add(sum / numbers.size());               // 평균
        answer.add(numbers.get(numbers.size() / 2));    // 중앙값
        return answer;
    }
}
