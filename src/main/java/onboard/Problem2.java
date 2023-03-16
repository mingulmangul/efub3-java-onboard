package onboard;

public class Problem2 {

    public static void swap(Integer[] array, int left, int right) {
        int end = (right - left) / 2;
        for (int i = 0; i <= end; i++) {
            Integer temp = array[left + i];
            array[left + i] = array[right - i];
            array[right - i] = temp;
        }
    }

    public static Integer[] solution(Integer[][] flipCards) {
        Integer[] answer = new Integer[20];
        // 초기화
        for (int i = 1; i <= 20; i++) {
            answer[i - 1] = i;
        }
        // 카드 뒤집기
        for (Integer[] flipCard : flipCards) {
            swap(answer, flipCard[0] - 1, flipCard[1] - 1);
        }
        return answer;
    }
}
