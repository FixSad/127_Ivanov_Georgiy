public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно
        int min, max;

        if (n1<n2){
            min = n1;
            max = n2;
        }
        else {
            min = n2;
            max = n1;
        }

        int k = 0;
        for (int i=min; i<=max; i++ ){
            if ((i%a==0) && (i%b!=0)){
                k++;
            }
        }
        return k;
    }

    @Override
    public int subtask_2_for(int num) {
        // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num
        String s = "";
        for(int i = 1; s.length() < num; i++){
            s += Integer.toString(i).repeat(i);
        }
        String last = s.substring(s.length()-1);
        int i = Integer.parseInt (last);
        return i;
    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        // Дана последовательность
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности
        int[] a = new int[cnt];
        a[0] = num;
        int sum = num;
        for (int i = 1; i<cnt; i++){
            a[i] = a[i-1] * d + 1;
            sum += a[i];
        }
        return sum;
    }

    @Override
    public int subtask_4_for(int n) {
        // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)
        int sum = 0;
        int pr = 1;
        for (int i = 1; i<=n; i++){
            pr = 1;
            for(int j = i; j>0; j--){
                pr = pr * j;
            }
            sum += pr;
        }
        return sum;
    }
}
