package youTubeLessons;

public class Recursion {
    //recursion - вызов метода в теле этого же метода
    public static void main(String[] args) {
        //4! = 4 * 3 * 2 * 1
        //1! = 1
        //15! = 15 * 14 * 13..... * 2 *1
        System.out.println(fac(4));
    }
    //fac(4)
    //4 * fac(3)
    //3 * fac(2)
    //2 * fac(1)
    //fac(1) return 1
    //далее поднимаемся на верх и перемножаем
    //4 * 3
    //3 * 2
    //2 * 1
    //fac(1) return 1
private static int fac (int n) {
        if (n == 1)
            return 1;
        return n * fac (n-1);
    }
}
