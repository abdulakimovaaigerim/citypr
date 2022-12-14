import java.util.*;

public class Main {
    public static void main(String[] args) {
//
        Integer[] array = {1, 2, 3, 4, 5};
        getArray(array);
    }

    public static <T> void getArray(T[] array) {
        T element = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = element;
        System.out.println(Arrays.toString(array));

        System.out.println();

        City<Integer> city1 = new City<>(1,"Batken");
        City<Integer> city2 = new City<>(2,"Batken");
        City<Integer> city3 = new City<>(3,"Batken");
        City<Integer> city4 = new City<>(4,"Batken");
        City<Integer> city5 = new City<>(5,"Batken");
        City<Integer> city6 = new City<>(6,"Batken");

        List<City<Integer>>cityList = new ArrayList<>(List.of(city1,city2,city3,city4,city5,city6));

        Set<City<Integer>>citySet = new TreeSet<>();
        for (City<Integer> c:cityList) {
            if (c.getCode()%2==1){
                System.out.println(c);
            }
        }

        Person <String, Integer> person1 = new Person<>("Aigerim", 17);
        Person <String, Integer> person2 = new Person<>("Tansuluu", 20);
        Person <String, Integer> person3 = new Person<>("Aitunuk", 16);
        Person <String, Integer> person4 = new Person<>("Akylai", 15);
        List<Person<String, Integer>> list = new ArrayList<>(List.of(person1,person2,person3,person4));
        getAllPerson(list);

        System.out.println();

        Phone<String, Integer> phone1 = new Phone<>("Samsung", 64);
        Phone<String, Integer> phone2 = new Phone<>("Iphone", 256);
        Phone<String, Integer> phone3 = new Phone<>("Redmi", 128);
        Phone<String, Integer> phone4 = new Phone<>("Sony", 32);
        List<Phone<String, Integer>> list1 = new ArrayList<>(List.of(phone1,phone2,phone3,phone4));
        getAllPhone(list1);



    }
    public static List<Person<String, Integer>> getAllPerson(List<Person<String, Integer>> list){
        List<Person<String, Integer>> list1 = new ArrayList<>();
        for (Person<String, Integer> person:list){
            System.out.println(person);
        }
        return list1;
    }
    public static List<Phone<String, Integer>> getAllPhone(List<Phone<String, Integer>> list){
        List<Phone<String, Integer>> list1 = new ArrayList<>();
        for (Phone<String, Integer> phone:list){
            System.out.println(phone);
        }
        return list1;
    }


}