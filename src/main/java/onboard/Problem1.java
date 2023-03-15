package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute) {
        List<Integer> answer = new ArrayList<>();
        // 단위를 분으로 바꿔서 45분 빼기
        int time = hour * 60 + minute - 45;
        int nHour, nMin;
        if (time < 0) { // 45분 앞선 시간이 전날이 되는 경우
            nHour = 23;
            nMin = 60 + time;
        } else {
            nHour = time / 60;
            nMin = time % 60;
        }
        answer.add(nHour);
        answer.add(nMin);
        return answer;
    }
}
