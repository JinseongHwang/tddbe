public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money dollar = (Money) obj;
        return this.amount == dollar.amount;
    }
}
