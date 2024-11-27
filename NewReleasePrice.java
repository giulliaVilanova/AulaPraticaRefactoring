public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        // Filmes de lançamento recente dão 2 pontos se alugados por mais de 1 dia.
        return (daysRented > 1) ? 2 : 1;
    }
}
