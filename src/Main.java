public class Main {
    //Реализуйте метод isPowerOfThree() который определяет, является ли переданное число натуральной степенью тройки.
    // апример, число 27 – это третья степень (33), а 81 – четвёртая (34).
    public static boolean isPowerOfThree(double x) {
//        boolean isThree = false;
        while (x > 1) {
            x = x / 3;
        }
//        if (x == 1) {
//            isThree = true;
//        } else {
//            isThree = false;
//        };
//        return isThree;
        return (x == 1) ? true : false;
    }
    public static void fizzBuzz(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Реализуйте метод isBalanced(),
    //который принимает на вход строку, состоящую только из открывающих и закрывающих круглых скобок,
    //и проверяет, является ли эта строка корректной. Пустая строка (отсутствие скобок) считается корректной.
    public static boolean isBalanced(String str) {
        int count = 0;
//        boolean isBalanced = (count == 0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
            }if (count < 0){
                return false;
            }
        }
//        return isBalanced;
        return (count == 0) ? true : false;
    }
    //Реализуйте метод addDigits(), который принимает на вход неотрицательное целое число и возвращает другое число,
    //полученное из первого следующим преобразованием:
    //Итеративно сложите все входящие в него цифры до тех пор пока, не останется одна цифра.
    public static int addDigitsSum(int digit) {
        String s = String.valueOf(digit);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = count + digit % 10;
            digit = digit / 10;
        }
        return count;
    }
    public static int addDigits(int digit){
        while (digit > 9){
            digit = addDigitsSum(digit);
        }
        return digit;
    }
//Напишите метод diff(), который принимает два угла (integer),
//каждый от 0 до 360, и возвращает разницу между ними.
//Функция должна вернуть наименьшее значение.
    public static int diff(int corner1, int corner2){
        int diff = 0;
        if(corner1 < corner2){
            diff = corner2 - corner1;
        }else if(corner1 > corner2){
            diff = corner1 - corner2;
        }
        if(diff > 180){
            diff = 360 - diff;
        }
        return diff;
    }
    //Реализуйте метод fib(), находящий положительные числа Фибоначчи. Аргументом является порядковый номер числа.
    //f(0) = 0
    //f(1) = 1
    //f(n) = f(n-1) + f(n-2)
    public static int fib(int x){
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        for (int i = 2; i < x; i++){
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            }
        return n2;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(6));
        fizzBuzz(15, 18);
        System.out.println(isBalanced("(()())"));
        System.out.println(diff(120, 280));
        System.out.println(fib(3));
        System.out.println(fib(5));
        System.out.println(fib(10));
    }
}