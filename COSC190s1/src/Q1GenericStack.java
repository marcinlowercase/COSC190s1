import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Q1GenericStack<E> {
    private final ArrayList<E> values;

    public Q1GenericStack() {
        values = new ArrayList<>();
    }

    public Q1GenericStack(ArrayList<E> values) {
        this.values = values;
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public int getSize() {
        return values.size();
    }

    public boolean push(E value) {
        return values.add(value);
    }

    public E pop() {
        return values.removeLast();
    }

    public E peek() {
        return values.getLast();
    }

    public List<E> fetchMatching(Predicate<E> predicate) {
        // complete with appropriate code
        List<E> returnList = new ArrayList<>();
        for (E e : this.values)
        if (predicate.test(e)) {
            returnList.add(e);
        }
        return returnList;
    }

    public ArrayList<E> convert(Function<E, E> function, Predicate<E> predicate) {
        // complete with appropriate code
        ArrayList<E> returnList = new ArrayList<>();
        for (E e : this.values){
            if (predicate.test(e)){
                returnList.add(function.apply(e));
            }
        }

        return returnList;
    }


}
