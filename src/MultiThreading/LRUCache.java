package MultiThreading;

import java.util.LinkedHashMap;

public class LRUCache<Key, Value> implements Cache<Key, Value> {
    private final LinkedHashMap<Key, Value> linkedHashMap;
    private final Integer capacity;

    public LRUCache(Integer capacity) {
        this.linkedHashMap = new LinkedHashMap<>(capacity, 0.75f, true){
            public boolean removeEldestEntry(java.util.Map.Entry<Key, Value> eldest) {
                return this.size() > capacity;
            }
        };
        this.capacity = capacity;
    }

    @Override
    public Value get(Key key) {
        return linkedHashMap.get(key);
    }

    @Override
    public void set(Key key, Value value) {
        if (this.linkedHashMap.size() == this.capacity) {
            System.out.println("Evicting the least recently used key");
        }
        linkedHashMap.put(key, value);
    }

    @Override
    public void printValues() {
        for(Key i : this.linkedHashMap.keySet()) {
            System.out.println(i);
        }
    }
}
