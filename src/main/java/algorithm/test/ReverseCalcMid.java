package algorithm.test;

/**
 * Created on 2021/4/13.5:04 下午
 *
 * @author 刘会贤
 * @Description 类文件说明
 * @Version 1.0
 */
public class ReverseCalcMid {
    public static void main(String[] args) {
        int[] reverse = new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3};
        int i = calcMid(reverse, 0, reverse.length - 1, 0);
        System.err.println("转折点" + i);
        if (i < reverse.length / 2)
            System.err.println("中位数" + reverse[i + reverse.length / 2]);
        else
            System.err.println("中位数" + reverse[i - reverse.length / 2]);
    }

    public static int calcMid(int[] reverse, int start, int end, int startIs) {
        int mid = (start + end) / 2;
        System.err.println("中间值：" + reverse[mid]);
        if (reverse[mid] < reverse[0]) {
            if (startIs == 0) {
                startIs = -1;
            } else if (startIs == 1) {
                if (mid > 0 && reverse[mid - 1] > reverse[mid]) {
                    return mid - 1;
                }

                return mid;
            }

            return calcMid(reverse, start, mid, startIs);
        } else if (reverse[mid] > reverse[0]) {
            if (startIs == 0) {
                startIs = 1;
            } else if (startIs == -1) {
                if (mid > 0 && reverse[mid - 1] > reverse[mid]) {
                    return mid - 1;
                }

                return mid;
            }

            return calcMid(reverse, mid, end, startIs);
        } else return mid;
    }
}
