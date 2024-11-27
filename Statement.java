import java.util.Enumeration;

public abstract class Statement {

    // Método Template
    public String value(Customer aCustomer) {
        String result = headerString(aCustomer);

        Enumeration rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalString(each);
        }

        result += footerString(aCustomer);
        return result;
    }

    // Métodos abstratos a serem implementados pelas subclasses
    protected abstract String headerString(Customer aCustomer);
    protected abstract String rentalString(Rental aRental);
    protected abstract String footerString(Customer aCustomer);
}
