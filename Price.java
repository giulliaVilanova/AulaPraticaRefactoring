public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        // Regra padrão para pontos de aluguel
        return 1;
    }
}
