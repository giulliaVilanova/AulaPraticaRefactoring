public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented); // Método já existente.

    public int getFrequentRenterPoints(int daysRented) {
        // Lógica base para calcular pontos (comportamento padrão).
        return 1; // A maioria dos filmes gera 1 ponto por aluguel.
    }
}
