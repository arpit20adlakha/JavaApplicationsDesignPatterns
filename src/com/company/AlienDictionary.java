package com.company;

import java.util.*;

public class AlienDictionary {
    public static void addEdge(ArrayList<ArrayList<Character>> arrOfLists, Character i, Character j) {
        arrOfLists.get(i - 'a').add(j);
    }

    public  static String findOrder(String [] dict, int N, int K)
    {

        ArrayList<ArrayList<Character>> arrOfLists = new ArrayList<ArrayList<Character>>();

        for (int i=0; i< K ; i++) {
            arrOfLists.add(new ArrayList<>());

        }

        for (int i = 0; i < N - 1 ; i++) {
            for (int j=0; j < dict[i].length() && j < dict[i+1].length(); j++) {
                if (dict[i].charAt(j) != dict[i+1].charAt(j)) {
                    addEdge(arrOfLists, dict[i].charAt(j), dict[i+1].charAt(j));
                    break;
                }
            }
        }

        Map<Character, Boolean> visited = new HashMap<>();
        Stack<Character> s = new Stack<>();

        for (List<Character> list : arrOfLists) {
            int t = arrOfLists.indexOf(list);
            t += 'a';
            Character c = (char)t;
            if (visited.get(c) == null)
                topologicalSort(arrOfLists, list, s, visited, c);
        }

        String string = "";
        while(!s.isEmpty()) {
            string = string.concat(String.valueOf(s.peek()));
            s.pop();
        }
        return string;
    }

    public static void topologicalSort(ArrayList<ArrayList<Character>> arrOfLists, List<Character>list, Stack<Character> s, Map<Character, Boolean> visited, Character t)  {

        visited.put(t, true);

        for (Character c : list) {
            if (visited.get(c) == null ) {
                topologicalSort(arrOfLists, arrOfLists.get(c - 'a'), s, visited, c);
            }
        }
        s.push(t);
    }


    public static void main(String[] args) {
        String Dict[ ] = { "baa", "abcd", "abca", "cab", "cad" };
        System.out.println(findOrder(Dict, 5, 4));
    }
}
