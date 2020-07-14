package imooc.test2.test;

import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        for (Integer integer:integers){
            System.out.println(integer.hashCode());
        }


        System.out.println(integers);
        String s="123";
        int i1 = s.hashCode();
        System.out.println(i1);
        int i = integers.hashCode();
        System.out.println(i);
//        List<Integer> intList = Arrays.asList(2, 3, 1);
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(3);
//        integers.add(2);
//        Collections.sort(integers);
//        System.out.println(integers);

//        List<Emp> empList;
//        Emp emp1 = new Emp(2,"Guan YunChang");
//        Emp emp2 = new Emp(3,"Zhang Fei");
//        Emp emp3 = new Emp(1,"Liu Bei");
//        empList = Arrays.asList(emp1,emp2,emp3);
//        Collections.sort(empList, (o1, o2) -> o2.getEmpno()-o1.getEmpno());
//        System.out.println(empList);


//        HashMap<Integer, Emp> empHashMap = new HashMap<>();
//        empHashMap.put(1,new Emp(2,"aaa"));
//        empHashMap.put(2,new Emp(3,"bbb"));
//        empHashMap.put(3,new Emp(1,"ccc"));
//
//        Set<Map.Entry<Integer, Emp>> entries = empHashMap.entrySet();
//        List<Map.Entry<Integer, Emp>> list = new ArrayList<>(entries);
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Emp>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Emp> o1, Map.Entry<Integer, Emp> o2) {
//                return o1.getValue().getEmpno()-o2.getValue().getEmpno();
//            }
//        });
//        System.out.println(list);
//        LinkedHashMap<Integer, Emp> linkedHashMap = new LinkedHashMap<>();
//        for (Map.Entry<Integer, Emp> empEntry:list){
//            linkedHashMap.put(empEntry.getKey(),empEntry.getValue());
//        }
//        System.out.println(linkedHashMap);

    }
}
