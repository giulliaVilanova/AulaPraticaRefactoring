public abstract class Price {
    public abstract int getPriceCode();

    public double getCharge(int daysRented) {
        // Código movido de `Movie` para cá.
        switch (getPriceCode()) {
            case Movie.REGULAR:
                double amount = 2;
                if (daysRented > 2) {
                    amount += (daysRented - 2) * 1.5;
                }
                return amount;
            case Movie.NEW_RELEASE:
                return daysRented * 3;
            case Movie.CHILDRENS:
                double childrenAmount = 1.5;
                if (daysRented > 3) {
                    childrenAmount += (daysRented - 3) * 1.5;
                }
                return childrenAmount;
            default:
                throw new IllegalArgumentException("Invalid Price Code");
        }
    }
}
