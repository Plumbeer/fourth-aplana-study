public class RandomArr20 {
    public static void main (String arg[]) {
        int myArray[];
        //Задаём массив размерностью 20
        myArray = new int[21];

        System.out.println("Исходный массив: ");
        //Заполняем массив случайными числами от -10 до +10
        for (int i=0; i<21; i++) {
            myArray[i] = (int)(Math.random()*21)-10;
            //Выводим элементы массива в консоли
            if (i<20){
                System.out.print(myArray[i] + " ");
            }
            else {
                System.out.println(myArray[i] + " ");
            }
        }

        //Находим минимальный положительный элемент массива
        int minMaxItem = 10;
        int indMinMax = 0;

        for (int i=0; i<21; i++) {
            if (myArray[i]>0) {
                if (myArray[i]<minMaxItem) {
                    minMaxItem = myArray[i];
                    indMinMax = i;
                }
            }
        }
        System.out.println("Минимальный положительный элемент массива = " + minMaxItem);
        System.out.println("Его индекс = " + indMinMax);

        //Находим максимальный отрицательный элемент массива
        int maxMinItem = -10;
        int indMaxMin = 0;

        for (int i=0; i<21; i++) {
            if (myArray[i]<0) {
                if (myArray[i]>maxMinItem) {
                    maxMinItem = myArray[i];
                    indMaxMin = i;
                }
            }
        }
        System.out.println("Максимальный отрицательный элемент массива = " + maxMinItem);
        System.out.println("Его индекс = " + indMaxMin);

        int itemElm = myArray[indMaxMin];
        myArray[indMaxMin] = myArray[indMinMax];
        myArray[indMinMax] = itemElm;

        System.out.println("Изменённый массив ");

        for (int i=0; i<21; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
