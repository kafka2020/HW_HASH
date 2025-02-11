import java.util.Objects;

public class Address {
    protected String country;
    protected String city;

    public Address(String country, String city) {
        this.country = country.toLowerCase();
        this.city = city.toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        Address address = (Address) o;
        return country.equals(address.country) && city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }
}
