import java.util.Arrays;
import java.util.Comparator;

public class City<T> implements Comparable<City<T>> {
    private T code;
    private String name;

    public City(T code, String name){
        this.code = code;
        this.name = name;
    }

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "code: " + code +
                "\nname: " + name;
    }

    @Override
    public int compareTo(City<T> o) {
        if (code==getCode()){
            return 0;
        } else if (code==getCode()){
            return -1;
        }
        return 1;
    }
}