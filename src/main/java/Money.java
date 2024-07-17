public abstract class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount
                && this.getClass().equals(money.getClass());
    }

    public abstract Money times(int multiplier);
}
