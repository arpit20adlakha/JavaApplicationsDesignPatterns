package MultiThreading;

public interface Cache<Key, Value> {
    void set(Key key, Value value);
    Value get(Key key);
    void printValues();
}
