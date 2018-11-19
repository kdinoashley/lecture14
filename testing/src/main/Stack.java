public class Stack<X> {
    private StackItem<X> last = null;

    public Stack() {
    }

    public boolean isEmpty() {
        return this.last == null;
    }

    public void push(X value) {
        StackItem<X> item = new StackItem<X>(value);
        item.setPrevious(this.last);
        this.last = item;
    }

    public X pop() {
        X result = null;

        if(this.last != null) {
            result = this.last.getValue();
            this.last = this.last.getPrevious();
        }

        return result;
    }
}
