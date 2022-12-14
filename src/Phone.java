public class Phone <T,E> implements Comparable<Integer>{
    private T brand;
    private E memory;

    public Phone(T brand, E memory) {
        this.brand = brand;
        this.memory = memory;
    }

    public T getBrand() {
        return brand;
    }

    public void setBrand(T brand) {
        this.brand = brand;
    }

    public E getMemory() {
        return memory;
    }

    public void setMemory(E memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone" +
                "brand: " + brand +
                "\nmemory: " + memory ;
    }

    @Override
    public int compareTo(Integer o) {
        if(memory==getMemory()){
            return 0;
        } else if (memory==getMemory()) {
            return -1;
        }
        return 1;

    }
}
