package onboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number) {
        Integer answer = 0;
        // 내림차순 정렬하기
        List<Integer> list = new ArrayList<>();
        while (number > 0) {
            list.add(number % 10);
            number /= 10;
        }
        list.sort(Collections.reverseOrder());
        // 정수로 변환하기
        for (Integer num : list) {
            answer = answer * 10 + num;
        }
        return answer;
    }
}
