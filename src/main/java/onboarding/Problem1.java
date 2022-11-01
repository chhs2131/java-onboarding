package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    // 숫자를 각 자릿수로 나눠서 배열로 반환하는 함수
    private static List<Integer> splitInt(Integer number) {
        List<Integer> result = new ArrayList<Integer>();

        // number의 각 자릿수를 result에 저장한다.
        while(number > 0) {
            result.add(number % 10);
            number /= 10;
        }

        return result;
    }

    // 주어진 배열에 숫자들을 합하거나 곱하여 나오는 큰 수를 반환하는 함수
    private static int maxScore(List<Integer> numbers) {
        int resultSum = sumNumbers(numbers);
        int resultMulti = multiplyNumbers(numbers);

        return Math.max(resultSum, resultMulti);
    }

    // 주어진 배열에 수를 모두 합하는 함수
    private static int sumNumbers(List<Integer> numbers) {
        int result = 0;
        for(int n : numbers)
            result += n;
        return result;
    }

    // 주어진 배열에 수를 모두 곱하는 함수
    private static int multiplyNumbers(List<Integer> numbers) {
        int result = 1;
        for(int n : numbers)
            result *= n;
        return result;
    }
}