package MultiThreading;

public class TesterLru {
    public static void main(String[] args) {
        CacheFactory<Integer, String>  cacheFactory = new CacheFactory<>();

        Cache<Integer, String> cache = cacheFactory.getDefaultCache(3);
        cache.set(1, "Jon");
        cache.set(2, "Con");
        cache.set(3, "Mon");
        System.out.println(cache.get(2));
        cache.set(4, "Bron");
        System.out.println(cache.get(3));

        cache.printValues();
        cache.set(6, "Hadimba");
        cache.printValues();


    }
}
