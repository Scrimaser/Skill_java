public class Work_3_9 {

    //Метод подсчета факториала
    public void factorialCalculator(int number) {
        var result = 1;
        for (int j = result + 1; j <= number; j++) {
            //Переменная result умножается на переменную j из цикла
            result *= j;
        }
        //Вывод полученного факториала
        System.out.println("Факториал числа " + number + " = " + result);
    }

    public void forCycle(int target) {
        for (int i = 1; i <= target ; i++) {
            for (int j = target; j >= 1; j--) {
                if (i * j == target) {
                    System.out.println(i + " * " + j + " = " + target);
                }
            }
        }
    }
}
