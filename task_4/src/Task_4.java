public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        int a[] = new int[size];
        a[0] = a0;
        for (int i = 1; i < a.length; i++){
            a[i] = a[i-1] + d;
        }
        return a;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        int a[] = new int[size];
        a[0] = 1;
        int s = 0;
        for(int i = 1; i<a.length; i++){
            s += a[i-1];
            a[i] = s;
        }
        return a;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        int a[] = new int[size];
        a[0] = 0;
        if (size > 1){
            a[1] = 1;
            for (int i = 2; i < a.length; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
        }
        return a;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        int max = data[0];
        for(int i = 0; i < data.length; i++){
            if(data[i] > max)
                max = data[i];
        }
        return max;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int min = 99999;
        for (int i = 0; i<data.length;i++){
            if (data[i]<min){
                min = data[i];
            }
        }
        for (int j = 0; j<data.length;j++){
            if (data[j]>min && data[j]%k==0){
                min = data[j];
            }
        }
        return min;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        int[] arr = new int[arr1.length+arr2.length];
        for(int i = 0; i < arr1.length; i++){
            arr[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            arr[arr1.length + i] = arr2[i];
        }

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return arr;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        int ar1 = arr1.length;
        int ar2 = arr2.length;

        int [] summ = new int[ar1 + ar2];
        int i = 0, j = 0, k = 0;
        for (;i<ar1 && j<ar2; k++)
            if (arr1[i] < arr2[j]) {
                summ[k] = arr1[i];
                i++;
            } else {
                summ[k] = arr2[j];
                j++;
            }
        for (; j < ar2; j++, k++)
            summ[k] = arr2[j];

        for (; i < ar1; i++, k++)
            summ[k] = arr1[i];

        return summ;
    }
}
