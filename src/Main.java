import java.util.*;

public class Main extends User{
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Alex", 23);
        people.put("Clara", 15);
        people.put("Leo", 35);
        people.put("Roma", 65);
        doubleOld(people);
        User grim = new User();
        User grm = new User();
        User gim = new User();
        TreeMap<User, String> o = new TreeMap<>();
        o.put(grim, "Programmer");
        o.put(grm, "Programmer");
        o.put(gim, "Programmer");
        Comparable(o);
        ComparableByName(o);
        TreeMap<String, User> one = new TreeMap<>();
        TreeMap<String, User> two = new TreeMap<>();
        one.put("I like books", grim);
        one.put("I looks", grm);
        two.put("I like boks", gim);
        two.put("I looks", grm);
//        CombineIntoOne(one, two);
        HashMap<Integer, String> peopl = new HashMap<>();
        peopl.put(23, "Alex");
        peopl.put(15, "Clara");
        peopl.put(35, "Leo");
        peopl.put(65, "Roma");
        toTreeMap(peopl);
        listOfValues(people);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alex", 232);
        treeMap.put("Clara", 15);
        treeMap.put("Leo", 35);
        treeMap.put("Roma", 65);
        toTreeMap(treeMap);



    }


    public static void doubleOld(HashMap<String, Integer> people){
        for (Map.Entry<String,Integer> p :people.entrySet()) {
            int t =p.getValue()*2;
            p.setValue(t);
            System.out.println(p);
        }
    }

    public static void copyUnder100(HashMap<Integer,String> id){
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<Integer, String> p :id.entrySet()){
            if (p.getKey()>100) treeMap.put(p.getKey(),p.getValue());
        }
    }

    public static void Comparable(TreeMap<User, String> o){
        System.out.println(o.toString());
    }

    @Override
    public int compareTo(User o) {
        return  this.name.compareTo(o.name);
    }

    public static void ComparableByName(TreeMap<User, String> o){
        System.out.println(o.toString());
    }

//    public static void CombineIntoOne(TreeMap<String, User> one, TreeMap<String, User> two){
//        if (one.containsKey(two)){
//               one.remove(one.containsKey(two));
//        }
//        System.out.println(one + " " + two);
//    } честно говоря не понимаю по какому признаку их правильно сравнивать

    public static TreeMap<String, Integer> toTreeMap(HashMap<Integer,String> o){
        TreeMap<String, Integer> treeMap = new TreeMap();
        for (Map.Entry<Integer, String> e:o.entrySet()) {
            treeMap.put(e.getValue(), e.getKey());
        }
        System.out.println(treeMap);
        return treeMap;
    }

    public static List<Integer> listOfValues(HashMap<String, Integer> e){
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> o: e.entrySet()) {
            list.add(o.getValue());
        }
        System.out.println(list);
        return list;
    }

    public static HashMap<Integer,String> toTreeMap(TreeMap<String, Integer> o){
        HashMap<Integer,String> map = new HashMap<>();
        for (String kei: o.keySet()) {
            for (Integer key : o.values()) {
                if (key > 50) {
                    map.put(key, kei);
                }
            }
        }
        System.out.println(map);
        return map;
    }

    //последнее не доконца понимаю реализацию
}