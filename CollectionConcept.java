import java.util.*;

public class CollectionConcept {
    public void ArryList_fn() {

        // Collection API will work with objects for variable datatype
        List<Integer> nums = new ArrayList<Integer>(); // <> - Generic
        nums.add(0);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(3);
        System.out.println("ArrayList Values " + nums);
        System.out.println("Show the of 2nd element " + nums.get(2));

        // Collections have funcationality to sort collection APIs
        Collections.sort(nums);

        System.out.println("Sorted ArrayList " + nums);

    }

    public void Set_fn() {

        // Set will support only Unique values
        Set<Integer> hset = new HashSet<Integer>(); // <> - Generic
        hset.add(8);
        hset.add(2);
        hset.add(9);
        hset.add(2);
        hset.add(null);

        // The output will not in sorted way but have unique values
        Iterator<Integer> it = hset.iterator();
        while (it.hasNext()) {
            System.out.println("Output of HashSet : " + it.next());
        }

        // Set will support only Unique values and output in sored way
        Set<Integer> tset = new TreeSet<Integer>(); // <> - Generic
        tset.add(8);
        tset.add(2);
        tset.add(9);
        tset.add(2);
        tset.add(2);

        // The output will not in sorted way
        for (int i : tset) {
            System.out.println("Output of Treeset : " + i);
        }

    }

    public void map_implementation() {
        System.out.println("HASHMAP Implementation =========");
        Map<String, Integer> students = new HashMap<>();
        students.put("Priya", 30);
        students.put("Raj", 35);
        students.put("Amulu", 3);

        students.put("Amulu", 5); // the value will be update in exisiting one, becoz key will be unique
        System.out.println(students);

        for (String name : students.keySet()) {
            System.out.println("Output of HashMap : " + name + " - " + students.get(name));
        }

        System.out.println("HASHTABLE Implementation =========");
        Map<String, Integer> students1 = new Hashtable<>();
        students1.put("Priya", 30);
        students1.put("Raj", 35);
        students1.put("Amulu", 3);

        students1.put("Amulu", 5); // the value will be update in exisiting one, becoz key will be unique
        System.out.println(students1);

        for (String name : students1.keySet()) {
            System.out.println("Output of HashTable : " + name + " - " + students1.get(name));
        }

    }

    public void compatator_comparable() {

        // Comparator<Integer> com = new Comparator<Integer>() {

        // public int compare(Integer i, Integer j) {

        // if (i % 10 > j % 10) {
        // return 1; // swap the elements
        // } else {
        // return -1;
        // }

        // }

        // };
        // Used Lamba function for above Compator implementation - func interface
        Comparator<Integer> com = (i, j) -> {
            return (i % 10 > j % 10) ? 1 : -1;
        };
        // Ex for Compatator
        List<Integer> nums = new ArrayList<Integer>(); // <> - Generic
        nums.add(20);
        nums.add(32);
        nums.add(31);
        nums.add(27);
        nums.add(34);

        // Sorting based on last digit of the ArrayList values
        Collections.sort(nums, com);

        System.out.println("Comparator Example :" + nums);
    }
}
