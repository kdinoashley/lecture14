public class StackItem<T> {
    private T value;
    private StackItem<T> previous = null;

    public T getValue() {
        return this.value;
    }

    public StackItem<T> getPrevious() {
        return this.previous;
    }

    public void setPrevious(StackItem<T> item) {
        this.previous = item;
    }

    public StackItem(T value) {
        this.value = value;
    }
}
