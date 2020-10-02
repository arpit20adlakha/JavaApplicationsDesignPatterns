package com.company;

public class SomeClass {

        int val = 50;
        String str = "default";

        public SomeClass() {
            this(100);
        }

        public SomeClass(int val) {
            this.val = val;
        }

        public SomeClass(String str) {
            this();
            this.str = "some-value";
        }

        public SomeClass(int val, String str) {
            this(str);
        }
}
