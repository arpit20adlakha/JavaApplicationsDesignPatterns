package SorterUsingGenerics;


import java.util.*;

public class Main {
    public static void main(final String[] args) {

        //TypeWork.workAll("natural","numbers",1L);

        Map<String,String> argsMap=new HashMap<>();
        for (int i=0;i<args.length;i+=2){
            argsMap.put(args[i],args[i+1]);
        }

        switch (argsMap.getOrDefault("-dataType","word")) {
            case "long":
                TypeWork.workAll(argsMap.getOrDefault("-sortingType","natural"),"numbers",1L);
                break;
            case "line":
                TypeWork.workAll(argsMap.getOrDefault("-sortingType","natural"),"lines","lines");
                break;
            default:
                TypeWork.workAll(argsMap.getOrDefault("-sortingType","natural"),"words","words");
        }

    }


    static class MapUtil {

        public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map ){
            ValueComparator<K,V> bvc =  new ValueComparator<K,V>(map);
            TreeMap<K,V> sorted_map = new TreeMap<K,V>(bvc);
            sorted_map.putAll(map);
            return sorted_map;
        }

    }

    static class ValueComparator<K, V extends Comparable<? super V>> implements Comparator<K> {

        Map<K, V> base;
        public ValueComparator(Map<K, V> base) {
            this.base = base;
        }

        public int compare(K a, K b) {
            int result = (base.get(a).compareTo(base.get(b)));
            if (result == 0) result=1;
            // returning 0 would merge keys
            return result;
        }
    }


    static class TypeWork{
        static Scanner scanner = new Scanner(System.in);

        public static <T extends Comparable> void  workAll(String sort,String type,T t){

            List<T> arr = new ArrayList<>();
            while (scanner.hasNext()) {
                if ("numbers".equals(type)) {
                    arr.add((T) new Integer(Integer.parseInt(scanner.next())));
                } else if ("words".equals(type)) {
                    arr.add((T) scanner.next());
                } else {
                    arr.add((T) scanner.nextLine());
                }
            }
            Collections.sort(arr);
            System.out.println(String.format("Total %s: %s.",type,arr.size()));
            // Map for sortedCounts
            LinkedHashMap<T,Integer> dataEntryToCount=new LinkedHashMap<>();

            if ("natural".equals(sort)) {
                System.out.print("Sorted data:"+(type.equals("lines")?"\n":""));

                for (T i:arr
                ) {
                    System.out.print(" "+i+(type.equals("lines")?"\n":""));
                }
            } else {
                for (T a:arr
                ) {
                    dataEntryToCount.put(a,Collections.frequency(arr,a));
                }
                MapUtil.sortByValue(dataEntryToCount).forEach((key,value)->System.out.println(key+": "+value+" time(s), "+Math.round((double)value*100/arr.size())+"%"));
            }
        }

    }
}