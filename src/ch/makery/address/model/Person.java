package ch.makery.address.model;

import ch.makery.address.util.LocalDateAdapter;
import javafx.beans.property.*;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Person {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty street;
    private final StringProperty postalCode;
    private final StringProperty city;
    private final ObjectProperty<LocalDate> birthday;

    /**
     * Default constructor.
     */
    public Person() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     *
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName) {

        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);


        // Some initial dummy data, just for convenient testing.
        this.street = new SimpleStringProperty("");
        this.postalCode = new SimpleStringProperty("");
        this.city = new SimpleStringProperty("");
        this.birthday = new SimpleObjectProperty<LocalDate>();

    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName.get();
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    /**
     *
     * @return
     */
    public StringProperty firstNameProperty() {
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName.get();
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    /**
     *
     * @return
     */
    public StringProperty lastNameProperty() {
        return lastName;
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return street.get();
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street.set(street);
    }

    /**
     *
     * @return
     */
    public StringProperty streetProperty() {
        return street;
    }

    /**
     *
     * @return
     */
    public String getPostalCode() {
        return postalCode.get();
    }

    /**
     *
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode.set(postalCode);
    }

    /**
     *
     * @return
     */
    public StringProperty postalCodeProperty() {
        return postalCode;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city.get();
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city.set(city);
    }

    /**
     *
     * @return
     */
    public StringProperty cityProperty() {
        return city;
    }

    /**
     *
     * @return
     */
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return birthday.get();
    }

    /**
     *
     * @param birthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    /**
     *
     * @return
     */
    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
}