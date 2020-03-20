package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//task#1 Приветствовать любого пользователя при вводе его имени через командную строку.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hi " + name + "!");
    }
}*/

//task#2 Отобразить в окне консоли аргументы командной строки в обратном порядке

/*public class Main {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            int x = Integer.parseInt(args[i]);
            System.out.println(x);
        }
    }
}*/

//task#3 Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

/*public class Main {
    public static void main(String[] args) {
        double number1 = Math.random() * 3; //Диапазон [0;1) умножается на 3. Получаем диапазон [0;3) 3 - исключительно. ( Math.random() * (3 - 0) ) + 0
        double number2 = Math.random() + 2; //К диапазону [0;1) прибавляем 2. Получаем диапазон [2;3)
        System.out.println(number1);
        System.out.println(number2);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        double number1 = Math.random() * 3; //Диапазон [0;1) умножается на 3. Получаем диапазон [0;3) 3 - исключительно. ( Math.random() * (3 - 0) ) + 0
        double number2 = Math.random() * 3;
        System.out.print(number1 + " ");
        System.out.print(number2);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 3); //диапазон [0;2]. (int)(( Math.random() * (b - a + 1) + a)
        int number2 = (int) (Math.random() * 3);
        System.out.print(number1 + " ");
        System.out.print(number2);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 3); //диапазон [0;2]. (int)(( Math.random() * (b - a + 1) + a)
        int number2 = (int) (Math.random() * 3);
        System.out.println(number1);
        System.out.println(number2);
    }
}*/

//task#4. Ввести пароль из командной строки и сравнить его со строкой-образцом.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your password: ");
        Scanner scan = new Scanner(System.in);
        String password1 = scan.nextLine();
        String password2 = "test";
        if (password1.equals(password2) ) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is wrong");
        }
    }
        }*/

//task#5 Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.

/*public class Main {
    public static void main(String[] args) {
        int[] valueArgs = new int[args.length]; //создание пустого массива new с длинною args.length
        int sum = 0;
        for (int i = args.length - 1; i >= 0; i--) {
            valueArgs[i] = Integer.parseInt(args[i]);
            System.out.println(valueArgs[i]);
            sum = sum + valueArgs[i];
        }
        System.out.println("Sum: " + sum);
    }

}*/

//task#6 Ввести с консоли n целых чисел. На консоль вывести:
//6.1. Четные и нечетные числа.

/*public class Main {
    public static void main(String[] args) {
        System.out.print("How many n numbers do you want to enter? ");
        Scanner scanNum = new Scanner(System.in);
        int n = scanNum.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter your n numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNum.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0) {
                System.out.println("Even numbers: " + arr[i]);
            }

            else if (arr[i]%2!=0) {
                System.out.println("Odd numbers: " + arr[i]);
           }
        }
    }
    }*/

//6.2. Наибольшее и наименьшее число.

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter?");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your numbers:");
        for (int i = 0; i < n; i++) {
            arr [i] = scanNumber.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }System.out.println("Min number: " + min);
    }
}
*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter?");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your n numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }System.out.println("Max number: " + max);
    }
}*/

//6.3. Числа, которые делятся на 3 или на 9.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 | arr[i] % 9 == 0) {
                System.out.println("Number can be divided to 3 or 9: " + arr[i]);
            }
        }
    }
}*/

//6.4. Числа, которые делятся на 5 и на 7.

/*public class Main{
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter? ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
                System.out.println("Number can be divided to 5 and 7: " + arr[i]);
            }
        }
    }
}*/

//6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр
//1 variant:

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int a1 = arr[i] / 100;
            int a2 = arr[i] % 100 / 10;
            int a3 = arr[i] % 100 % 10;
            if ((arr[i] > 99) && (arr[i] < 1000)) {
                if (a1 != a2 && a1 != a3 && a2 != a3) {
                    System.out.println("Number with different digits: " + arr[i]);
                }
            }
        }
    }
}*/

//2 variant:

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.next();
        }
        for (int i = 0; i < n; i++) {
            String[] digits = arr[i].split("");
            System.out.println(digits[1]);
            if (digits.length == 3) {
                Integer a0 = Integer.parseInt(digits[0]);
                Integer a1 = Integer.parseInt(digits[1]);
                Integer a2 = Integer.parseInt(digits[2]);
                if (!a0.equals(a1) && !a0.equals(a2) && !a1.equals(a2)) {
                    //System.out.println("Number with different digits: " + arr[i]);
                }
            }
        }
    }
}*/

//6.6. «Счастливые» числа.
//1 variant:

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int a1 = arr[i] / 1000;
            int a2 = arr[i] % 1000 / 100;
            int a3 = arr[i] % 100 / 10;
            int a4 = arr[i] % 10;
            int sum1 = a1 + a2;
            int sum2 = a3 + a4;
            if ((arr[i] > 999) && (arr[i] < 10000)) {
                if (sum1 == sum2) {
                    System.out.println("Happy number: " + arr[i]);
                }
            }
        }
    }
}*/

//2 variant:

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.next();
        }
        for (int i = 0; i < n; i++) {
            String[] digits = arr[i].split("");
            if (digits.length == 4) {
                Integer a0 = Integer.parseInt(digits[0]);
                Integer a1 = Integer.valueOf(digits[1]);
                Integer a2 = Integer.valueOf(digits[2]);
                Integer a3 = Integer.valueOf(digits[3]);
                if (a0 + a1 == a2 + a3) {
                    System.out.println("Happy number: " + arr[i]);
                }
            }
        }
    }
}
*/

//BLOCK# 2

//Ввести n чисел с консоли.
//task# 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumbers = new Scanner(System.in);
        int n = scanNumbers.nextInt();
        String [] arr = new String[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumbers.next();
        }
        String min = arr[0];
        String max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].length() <= min.length()) {
                min = arr[i];
                System.out.println(min.length());
            }
            if (arr[i].length() >= max.length()) {
                max = arr[i];
            }
        }
        System.out.println("Min number length: " + min.length() + "," + " number: " + min);
        System.out.println("Max number length: " + max.length() + "," + " number: " + max);
    }
}*/

//task# 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        String [] arr = new String[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.next();
        }
        for (int i =arr.length-1 ; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Numbers length by ascending: " + Arrays.toString(arr));
        for (int i = 0; i <arr.length/2 ; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }System.out.println("Numbers length by descending: " + Arrays.toString(arr));
    }
}*/

//task# 3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumbers = new Scanner(System.in);
        int n = scanNumbers.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumbers.next();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i].length();
        }
        int aver = sum / arr.length;
        System.out.println("Length`s sum: " + sum);
        System.out.println("Average length : " + aver);
        for (int i = 0; i < n; i++) {
            if (arr[i].length()>aver){
                System.out.println("Number`s length more than average: " + arr[i].length() + "," + " number: " + arr[i]);
            }
            if (arr[i].length()<aver){
                System.out.println("Number`s length less than average: " + arr[i].length() + "," + " number: " + arr[i]);
            }
        }
    }
}*/

//task# 4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumber.next();
        }
        String result = null;
        int outerRepDigitsAmnt = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            String[] chars = arr[i].split("");
            Arrays.sort(chars);
            int innerRepDigitsAmnt = 0;
            int firstDigit = Integer.parseInt(chars[0]);
            for (int j =1; j < chars.length ; j++) {
                if (firstDigit == Integer.parseInt(chars[j])) {
                    innerRepDigitsAmnt++;
                }
                firstDigit = Integer.parseInt(chars[j]);
            }
            if(outerRepDigitsAmnt > innerRepDigitsAmnt && innerRepDigitsAmnt > 0) {
                outerRepDigitsAmnt = innerRepDigitsAmnt;
                result = arr[i];
            }
        }
        if(result != null) {
            System.out.println(result);
        }
    }
}
*/

//task# 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

/*public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumbers = new Scanner(System.in);
        int n = scanNumbers.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumbers.next();
        }
        for (String i : arr) {
            byte[] a = i.getBytes();
            byte[] b = i.getBytes();
            Arrays.sort(b);
            if (Arrays.equals(a, b)) {
                System.out.println(i);
                break;
            }
        }
    }
}*/

//task#7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("How many n numbers do you want to enter? ");
        Scanner scanNumbers = new Scanner(System.in);
        int n = scanNumbers.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanNumbers.next();
        }
        for (int i = 0;  i< arr.length; i++) {
            String numbers = arr[i];
            String[] chars = arr[i].split("");
            Arrays.sort(chars);
            boolean unique = true;
            int firstDigits = Integer.parseInt(chars[0]);
            for (int j = 1; j < chars.length; j++) {
                if (firstDigits==Integer.parseInt(chars[j])){
                    unique = false;
                    break;
                } firstDigits=Integer.parseInt(chars[j]);
            }
            if (unique){
                System.out.println(numbers);
                break;
            }
        }
    }
}
*/

//task# 8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

/*public class Main {
    public static void main(String[] args) {
    System.out.println("How many n numbers do you want to enter? ");
    Scanner scanNumber = new Scanner(System.in);
    int n = scanNumber.nextInt();
    String[] arr = new String[n];
    System.out.println("Enter your numbers: ");
    for (int i = 0; i < n; i++) {
        arr[i] = scanNumber.next();
    }
    for (int i = 0; i < n; i++) {
        System.out.println(Arrays.toString(arr[i].split("")));
        System.out.println();
    }
}
}*/




