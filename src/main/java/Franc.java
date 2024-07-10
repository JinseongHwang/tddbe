public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Money dollar = (Money) obj;
        return this.amount == dollar.amount;
    }
}
