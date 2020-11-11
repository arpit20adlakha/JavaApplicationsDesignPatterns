package MultiThreading;

public class CacheFactory<Key, Value> {
    public Cache<Key, Value> getDefaultCache(Integer capacity) {
        return new LRUCache<Key, Value>(capacity);
    }
}
