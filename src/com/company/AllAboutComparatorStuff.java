package com.company;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;


public class AllAboutComparatorStuff {

    public static class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public static int compareByNameThenAge(Human t1, Human t2) {
            if (t1.name.equals(t2.name)) {
                return t1.age - t2.age;
            } else {
                return t1.name.compareTo(t2.name);
            }
        }
    }

    public void addEdge(ArrayList<ArrayList<Character>> arrOfLists, Character i, Character j) {
        arrOfLists.get(i).add(j);
    }

    public  String findOrder(String [] dict, int N, int K)
    {
        ArrayList<ArrayList<Character>> arrOfLists = new ArrayList<ArrayList<Character>>();

        HashMap<Integer, Character> characterHashMap = new HashMap<>();

        for (int i = 0; i < N - 1 ; i++) {
            for (int j=0; j < dict[i].length() && j < dict[j].length(); j++) {
                if (dict[i].charAt(j) != dict[i+1].charAt(j)) {
                    addEdge(arrOfLists, dict[i].charAt(j), dict[i+1].charAt(j));
                }
            }
        }

        Map<Character, Boolean>  visited = new HashMap<>();
        Stack<Character> s = new Stack<>();

        for (List<Character> list : arrOfLists) {
            int t = arrOfLists.indexOf(list);
            t += 'a';
            Character c = (char)t;
            topologicalSort(arrOfLists, list, s, visited, c);
        }

        String string = "";
        while(!s.isEmpty()) {
           string.concat(String.valueOf(s.peek()));
           s.pop();
        }
        return string;
    }

   public void topologicalSort(ArrayList<ArrayList<Character>> arrOfLists, List<Character>list, Stack<Character> s, Map<Character, Boolean> visited, Character t)  {

        visited.put(t, true);

        for (Character c : list) {
            if (visited.get(c) == null) {
                topologicalSort(arrOfLists, arrOfLists.get(c), s, visited, t);
            }
        }
        s.push(t);
   }

    public static void main(String[] args) {
        ArrayList<Character> [] arrOfLists = new ArrayList[4];


        Human human = new Human("Arpit", 3);

        List<Human> humanList = new ArrayList<>();
        Human[] arr = new Human[] { new Human("Poonam", 15), new Human("Arpit", 12)};

        humanList.add(new Human("Arpit", 20));
        humanList.add(new Human("Poonam", 22));
        humanList.add(new Human("Child", 15));
        humanList.sort(Human::compareByNameThenAge);
        humanList.stream().forEach(item -> System.out.println(item.getName() + " " + item.getAge()));









        Arrays.sort(arr, new Comparator<Human>() {
            @Override
            public int compare(Human t1, Human t2) {
                return t1.getAge() - t2.getAge();
            }
        });

        Stream.of(arr).forEach(item -> System.out.println(item.getName() + " " + item.getAge()));




        Collections.sort(humanList, new Comparator<Human>() {
            @Override
            public int compare(Human human, Human t1) {

                return human.getAge() - t1.getAge();
            }
        });

        humanList.stream().forEach(item -> System.out.println(item.getName() + " " + item.getAge()));

    }

    @Test
    public void TestingComparator() {
        List<Human> humans = new ArrayList<>();
        humans.add( new Human("Sarah", 10));
        humans.add(new Human("Jack", 12));


        Collections.sort(humans, new Comparator<Human>() {

            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }

        });

        Assert.assertSame(humans.get(0), new Human("Jack", 12));
    }

    @Test
    public void whenSortingEttitiesName_thenSorted() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah", 10));
        humans.add(new Human("Jack", 12));
        humans.stream().forEach(item -> System.out.println(item.getName() + " " + item.getAge()));

        humans.sort(( h1,  h2) -> h1.getName().compareTo(h2.getName()));

        Assert.assertEquals(humans.get(0).getName(), "Jack");
    }



}
