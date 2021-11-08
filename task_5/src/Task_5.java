import java.util.*;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int i = 0; i<data.size(); i++){
            if (data.get(i)%k==0 && data.get(i)%n!=0){
                newlist.add(data.get(i));
            }
        }
        return newlist;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0, ch = 1, rv = 0; i<size; i++){
            newList.add(ch);
            rv++;
            if (ch==rv){
                ch+=1;
                rv = 0;
            }
        }
        return newList;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите пересечение множеств s1 и s2
        s1.retainAll(s2);
        return s1;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите объединение множеств s1 и s2
        s1.addAll(s2);
        return s1;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите дополнение множества s1 до множества s2
        HashSet<Integer> s3 = new HashSet<>(s2);
        s3.retainAll(s1);
        s2.removeAll(s3);
        return s2;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        HashSet<Integer> s3 = new HashSet<>(s1);
        HashSet<Integer> s4 = new HashSet<>(s2);
        s3.removeAll(s2);
        s4.removeAll(s1);
        s4.addAll(s3);
        return s4;

    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        HashMap<String, Double> map = new HashMap<>();
        float size = data.size();
        double start_percent = 100 / size;
        for (int i = 0, repeat = 0; i < data.size(); i++) {
            if (!map.containsKey(data.get(i))) {
                for (int j = i; j < data.size(); j++) {
                    if (Objects.equals(data.get(i), data.get(j))) {
                        repeat++;
                    }
                }
                map.put(data.get(i), start_percent * repeat);
                repeat = 0;
            }
        }
        return map;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        double mean = 0;
        HashMap<String, Double> map = new HashMap<>();
        map.put("max", Collections.max(data));
        map.put("min", Collections.min(data));
        for (Double i: data){
            mean += i;
        }
        map.put("mean", mean/ data.size());
        return map;
    }
}
