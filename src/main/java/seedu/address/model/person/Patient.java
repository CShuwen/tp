package seedu.address.model.person;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.model.person.Address;
import seedu.address.model.person.DateOfBirth;
import seedu.address.model.person.DrugAllergy;
import seedu.address.model.person.Email;
import seedu.address.model.person.Gender;
import seedu.address.model.person.Ic;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.tag.Tag;

import java.util.Objects;
import java.util.Optional;

/**
 * Represents a Patient in the patient record
 */
public class Patient{
    private final Name name;
    private final Phone phone;
    private final Email email;
    private final Address address;
    private final DateOfBirth birthDate;
    private final Gender gender;
    private final Ic ic;
    private Optional<DrugAllergy> drugAllergy;
    private Optional<Phone> emergencyContact;

    /**
     * Constructs a {@code DateOfBirth}.
     * Every field must be present and not null.
     */
    public Patient(Name name, Phone phone, Email email, Address address, DateOfBirth birthDate, Gender gender, Ic ic) {
        requireAllNonNull(name, phone, email, address, birthDate, gender, ic);
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;
        this.ic = ic;
    }

    /**
     * Constructs a {@code DateOfBirth}.
     * Uses this constructor when want to include drug allergy or emergency contact of the patient.
     */
    public Patient(Name name, Phone phone, Email email, Address address, DateOfBirth birthDate, Gender gender, Ic ic,
        DrugAllergy drugAllergy, Phone emergencyContact) {
        this(name, phone, email, address, birthDate, gender, ic);
        this.drugAllergy = Optional.ofNullable(drugAllergy);
        this.emergencyContact = Optional.ofNullable(emergencyContact);
    }

    public DateOfBirth getBirthDate() {
        return this.birthDate;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Ic getIc() {
        return this.ic;
    }

    public DrugAllergy getDrugAllergy() {
        return this.drugAllergy.orElse(null);
    }

    public Phone getEmergencyContact() {
        return this.emergencyContact.orElse(null);
    }

    public Name getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public Email getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    /**
     * Returns true if both patients have the same identity and data fields.
     * This defines a stronger notion of equality between two patients.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Patient)) {
            return false;
        }

        Patient otherPatient = (Patient) other;
        return otherPatient.getName().equals(getName())
                && otherPatient.getPhone().equals(getPhone())
                && otherPatient.getEmail().equals(getEmail())
                && otherPatient.getAddress().equals(getAddress());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name, phone, email, address);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getName())
                .append("; Phone: ")
                .append(getPhone())
                .append("; Email: ")
                .append(getEmail())
                .append("; Address: ")
                .append(getAddress());
        return builder.toString();
    }

}
