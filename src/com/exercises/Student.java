package com.exercises;

import java.util.*;


public class Student implements Comparable {
    String name;
    int id;
    char grade;



    Student(String name) {
        this.name = name;
    }


    Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }



    public static void main(String[] args) {


        String[] names = {"Joey", "Chandler", "Monica", "Rachel", "Ross"};
        int[] ids = {3, 2, 1, 5, 4};
        char[] grades = {'C', 'B', 'A', 'B', 'A'};


        ArrayList<Student> students = new ArrayList<>();

        int length = names.length;


        for (int i = 0; i < length; i++) {
            students.add(new Student(names[i], ids[i], grades[i]));
        }

        // were passing null because sort is already doing the comparison
        // you can provide your own callback, but if null, it'll sort it automatically

        System.out.println("ESTUDYANTES");
        students.sort(null);
        System.out.println(students);




        Student joey = new Student("Joey", 4, 'C');
        Student chandler = new Student("Chandler", 5, 'A');
        Student monica = new Student("Monica", 3, 'B');
        Student rachel = new Student("Rachel", 1, 'B');
        Student ross = new Student("Ross", 2, 'A');


        ArrayList studs = new ArrayList<String>();
        studs.add(joey);
        studs.add(chandler);
        studs.add(monica);
        studs.add(rachel);
        studs.add(ross);


        System.out.println("STUDS");
        System.out.println(studs);
        studs.sort(null);
        System.out.println(studs);



        List<String> allNames = new ArrayList(Arrays.asList("Jack", "Sandra", "Alexis", "Kit", "Louie", "Xander", "Zylo", "Ray", "Bret", "Tifanny", "Aaron", "Cathy", "Robin", "Red", "Chris", "Bobby", "Julia", "Lyla", "Bob", "Xyla"));
        System.out.println(allNames);
        firstNames(allNames);
        sortedFirstNames(allNames);
    }

        
    public static void firstNames(List<String> names) {
        System.out.println("Names in HashMap");

        Map<String, List<String>> map = new HashMap<>();

        for (String name : names) {
            String firstInitial = String.valueOf(name.charAt(0));  //returns String representation of argument

            if (map.get(firstInitial) == null) {
                map.put(firstInitial, new ArrayList<>(Arrays.asList(name)));
            } else {
                map.get(firstInitial).add(name);
            }
        }

        System.out.println(map);
    }

        
    public static void sortedFirstNames(List<String> names) {
        System.out.println("Sorted keys of map using TreeMap - but not the values >.<");
        Map<String, ArrayList<String>> map = new TreeMap<>();

        for (String name : names) {
            String firstInitial = String.valueOf(name.charAt(0));

            if (map.get(firstInitial) == null) {
                map.put(firstInitial, new ArrayList<>(Arrays.asList(name)));
            } else {
                map.get(firstInitial).add(name);
            }
        }

        System.out.println(map);

    }

        
        
        
    @Override
    public int compareTo(Object o) {
        Student stud = (Student) o; // we have to cast the Object as the Student to specify the generics
//
//        if (this.id > stud.id) {
//            return 1;
//        } else if (this.id < stud.id) {
//            return -1;
//        } else {
//            return 0;
//        }


        return this.id - stud.id;

    }

        
    @Override
    public String toString() {
//        return id + ": " + name;
        return String.format("%d %s", id, name, grade);    // first write how you want it to show (d for int (cant do 'i', s for String, and then the fields)
    }

}