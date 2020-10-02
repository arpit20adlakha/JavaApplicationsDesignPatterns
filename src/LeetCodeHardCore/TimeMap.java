package LeetCodeHardCore;

import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

class TimeMap {
        HashMap<String, TreeMap<Integer, String>> storage = new HashMap<>();

        /** Initialize your data structure here. */
        public TimeMap() {

        }

        public void set(String key, String value, int timestamp) {
            if (storage.get(key) != null) {
                TreeMap<Integer, String> m1 = storage.get(key);
                m1.put(timestamp, value);
            } else {
                TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer integer, Integer t1) {
                        return integer - t1;
                    }
                });
                map.put(timestamp, value);
                storage.putIfAbsent(key, map);
            }

        }

        public String get(String key, int timestamp) {
            if (storage.get(key) == null) {
                return "";
            } else {


                TreeMap<Integer, String> m = storage.get(key);

                if (m.get(timestamp) != null) {
                    return m.get(timestamp);
                } else {
                    SortedMap<Integer, String> m1 = m.headMap(timestamp);
                    if (m1 != null) {
                        return m1.get(m1.lastKey());
                    } else {
                        return "";
                    }
                }
            }

        }


        class Time {

        }

        public static void main(String[] args) {
            TimeMap obj = new TimeMap();
            obj.set("love", "high", 10);
            obj.set("love", "low", 20);
            System.out.println(obj.get("love", 5));
        }
}

