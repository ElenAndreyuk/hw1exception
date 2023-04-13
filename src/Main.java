import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        int[] array2 = {10, 20, 3, 45, 65};
        int[] array3 = {1, 2, 3, 4, 5};

        System.out.println("---1---");
        printArray(array2);
        int[] array4 = plus1(array2) ;
        printArray(array4);
        System.out.println("-----------");

        isEvenNumber();
        System.out.println("-----------");
        System.out.println(arrayLength(array2));

        System.out.println("---2---");
        // 2.Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
        System.out.println("ошибки типа данных, наличия данных, несоответствия данных условиям");

        System.out.println("---3---");
        int[] array = difArray(array2, array3);
        printArray(array);

        System.out.println("---4---");
        int[] array5 = quotientOfNumber(array2, array3);
        printArray(array5);

    }
    // 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static void isEvenNumber()throws Exception{
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введите число: ");
        String value = iScanner.next();
        try{
            Integer number =Integer.valueOf(value);
            if (number%2 == 0){
                System.out.println("четное");
            }else {
                System.out.println("нечетное");
            }
        }catch(Exception e){
            throw new NumberFormatException("это не число, код ошибки -1");
        }
        iScanner.close();
    }
    public static int[] plus1(int[] array) throws Exception{
        if(array == null){
            new RuntimeException("нет данных, код ошибки -2");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]+1;
        }
        return array;
    }
    public static int arrayLength (int[] array) throws Exception{
        if (array == null){
            throw new Exception("нет данных, код ошибки -1");
        }
        if (array.length < 2){
            throw new Exception("маловато для массива, код ошибки -2");
        } else return array.length;

    }

//    3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.
    public static int[] difArray(int[] array2, int[] array3) throws Exception{
        if (array2.length != array3.length){
            throw new RuntimeException("Длина массивов отличается, код ошибки -1");
        }
        int[] array = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            array[i] = array2[i] - array3[i];
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    //  4. * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//   и возвращающий новый массив, каждый элемент которого равен частному элементов двух
//   входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
//   оповестить пользователя. Важно: При выполнении метода единственное исключение,
//   которое пользователь может увидеть - RuntimeException, т.е. ваше.

    public static int[] quotientOfNumber(int[] array1, int[] array2) throws Exception{
        if(array1.length != array2.length){
            throw new RuntimeException("\"Длина массивов отличается, код ошибки -1\"");
        }
        int[] arrayResult = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arrayResult[i] = array1[i] / array2[i];
        }
        return arrayResult;
    }
}
