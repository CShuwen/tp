package seedu.address.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.CareFlow;
import seedu.address.model.drug.Drug;
import seedu.address.model.readonly.ReadOnlyDrugInventory;

/**
 * An Immutable AddressBook that is serializable to JSON format.
 */
@JsonRootName(value = "careflow")
class JsonSerializableDrug {

    public static final String MESSAGE_DUPLICATE_DRUG = "Drugs list contains duplicate drug(s).";

    private final List<JsonAdaptedDrug> drugs = new ArrayList<>();

    /**
     * Constructs a {@code JsonSerializableDrug} with the given drugs.
     */
    @JsonCreator
    public JsonSerializableDrug(@JsonProperty("drugs") List<JsonAdaptedDrug> drugs) {
        this.drugs.addAll(drugs);
    }

    /**
     * Converts a given {@code ReadOnlyAddressBook} into this class for Jackson use.
     *
     * @param source future changes to this will not affect the created {@code JsonSerializableAddressBook}.
     */
    public JsonSerializableDrug(ReadOnlyDrugInventory source) {
        drugs.addAll(source.getDrugList().stream().map(JsonAdaptedDrug::new).collect(Collectors.toList()));
    }

    /**
     * Converts this address book into the model's {@code AddressBook} object.
     *
     * @throws IllegalValueException if there were any data constraints violated.
     */
    public CareFlow toModelType() throws IllegalValueException {
        CareFlow careFlow = new CareFlow();
        for (JsonAdaptedDrug jsonAdaptedDrug : drugs) {
            Drug drug = jsonAdaptedDrug.toModelType();
            if (careFlow.hasDrug(drug)) {
                throw new IllegalValueException(MESSAGE_DUPLICATE_DRUG);
            }
            careFlow.addDrug(drug);
        }
        return careFlow;
    }

}
