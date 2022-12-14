public class Person <T,E> implements Comparable<Integer>{

    private T name;
    private E age;

    public Person(T name, E age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person " +
                "name: " + name +
                "\nage: " + age ;
    }

    @Override
    public int compareTo(Integer o) {
        if(age==getAge()){
            return 0;
        } else if (age==getAge()) {
            return -1;
        }
        return 1;
    }
}
