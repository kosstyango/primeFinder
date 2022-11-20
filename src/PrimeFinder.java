public class PrimeFinder {
    public static void main(String[] args) {
        long number = 1000000000l; // начинаем искать с этого места
        while (true){
        for (int i=2; i<Math.sqrt(number); i++) {
            //System.out.println("проверяем " + number + " делением на " + i);
            if (number % i == 0) { // если остаток от деления 0,
                number++;
                i=2;// начинаем проверять следующее число
            }
        }
            System.out.println("PRIME: " + number++); // печатаем найденное простое число
        }
        }
    }
