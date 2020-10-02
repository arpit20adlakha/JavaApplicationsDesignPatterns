package SorterFunction;

public class SorterFactory {
    public Sorter getSorter(SorterTypes type){
        Sorter sorter = null;
        switch (type) {
            case LONG:
                sorter = new LongSorter();
                break;
            case LINE:
                sorter = new LineSorter();
                break;
            default:
                sorter = new WordSorter();
                break;
        }

        return  sorter;
    }
}