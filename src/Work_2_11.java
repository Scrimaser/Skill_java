import java.util.Arrays;

public class Work_2_11 {

    public void food(int milk, int powder, int eggs, int sugar, int oil, int apple) {

        if (apple >= 5) {
            System.out.println("Яблочный сок");
        }

        if (powder >= 400 && sugar >= 10 && milk >= 1000 && oil >= 30) {
            System.out.println("Блинчики");
        }

        if (milk >= 300 && powder >= 5 && eggs >= 5) {
            System.out.println("Омлет");
        }

        if (apple >= 3 && milk >= 100 && powder >= 300 && eggs >= 4) {
            System.out.println("Яблочный пирог");
        }
    }


    //Получаем на вход в метод 3 возраста

    public void ageComparator(int jackAge, int isoldaAge, int mickaelAge) {

        //Складываем переменные возраста в массив
        int[] agesArr = {jackAge, isoldaAge, mickaelAge};

        //Сортируем массив
        Arrays.sort(agesArr);

        //Создаем переменные и задаем им значение из массива от меньшего к большему
        var minAge = agesArr[0];
        var middleAge = agesArr[1];
        var maxAge = agesArr[2];

        //Выводим результат
        System.out.println(maxAge + "\n" + middleAge + "\n" + minAge);

    }
}
