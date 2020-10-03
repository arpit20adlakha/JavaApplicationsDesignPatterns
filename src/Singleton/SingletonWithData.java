package Singleton;

import io.reactivex.Single;

public class SingletonWithData {
    private static SingletonWithData instance;

    private  String data;

    private SingletonWithData (String data) {
        this.data = data;
    }

    public static SingletonWithData getInstance(String data) {
        if (instance == null) {
            return instance = new SingletonWithData(data);
        } else {
            instance.data = data;
            return instance;
        }
    }

}
