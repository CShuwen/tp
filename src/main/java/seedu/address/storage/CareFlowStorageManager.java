package seedu.address.storage;

import seedu.address.commons.core.LogsCenter;
import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyUserPrefs;
import seedu.address.model.UserPrefs;
import seedu.address.model.readonly.ReadOnlyDrugInventory;
import seedu.address.model.readonly.ReadOnlyPatientRecord;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.logging.Logger;

public class CareFlowStorageManager implements CareFlowStorage {
    private static final Logger logger = LogsCenter.getLogger(CareFlowStorageManager.class);
    private PatientRecordStorage patientRecordStorage;
    private DrugInventoryStorage drugInventoryStorage;
    private UserPrefsStorage userPrefsStorage;

    public CareFlowStorageManager(PatientRecordStorage patientRecordStorage, DrugInventoryStorage drugInventoryStorage,
                                  UserPrefsStorage userPrefsStorage) {
        this.patientRecordStorage = patientRecordStorage;
        this.drugInventoryStorage = drugInventoryStorage;
        this.userPrefsStorage = userPrefsStorage;
    }

    @Override
    public Path getUserPrefsFilePath() {
        return userPrefsStorage.getUserPrefsFilePath();
    }

    @Override
    public Optional<UserPrefs> readUserPrefs() throws DataConversionException, IOException {
        return userPrefsStorage.readUserPrefs();
    }

    @Override
    public void saveUserPrefs(ReadOnlyUserPrefs userPrefs) throws IOException {
        userPrefsStorage.saveUserPrefs(userPrefs);
    }

    @Override
    public Path getPatientRecordFilePath() {
        return patientRecordStorage.getPatientRecordFilePath();
    }

    @Override
    public Path getDrugInventoryFilePath() {
        return drugInventoryStorage.getDrugInventoryFilePath();
    }

    @Override
    public Optional<ReadOnlyPatientRecord> readPatientRecord() throws DataConversionException, IOException {
        return readPatientRecord(patientRecordStorage.getPatientRecordFilePath());
    }

    @Override
    public Optional<ReadOnlyDrugInventory> readDrugInventory() throws DataConversionException, IOException {
        return readDrugInventory(drugInventoryStorage.getDrugInventoryFilePath());
    }

    @Override
    public Optional<ReadOnlyPatientRecord> readPatientRecord(Path filePath) throws DataConversionException, IOException {
        logger.fine("Attempting to read data from file: " + filePath);
        return patientRecordStorage.readPatientRecord(filePath);
    }

    @Override
    public Optional<ReadOnlyDrugInventory> readDrugInventory(Path filePath) throws DataConversionException, IOException {
        logger.fine("Attempting to read data from file: " + filePath);
        return drugInventoryStorage.readDrugInventory(filePath);
    }

    @Override
    public void savePatientRecord(ReadOnlyPatientRecord patientRecord) throws IOException {
        savePatientRecord(patientRecord, patientRecordStorage.getPatientRecordFilePath());
    }

    @Override
    public void saveDrugInventory(ReadOnlyDrugInventory drugInventory) throws IOException {
        saveDrugInventory(drugInventory, drugInventoryStorage.getDrugInventoryFilePath());
    }

    @Override
    public void savePatientRecord(ReadOnlyPatientRecord patientRecord, Path filePath) throws IOException {
        logger.fine("Attempting to write to data file: " + filePath);
        patientRecordStorage.savePatientRecord(patientRecord, filePath);
    }

    @Override
    public void saveDrugInventory(ReadOnlyDrugInventory drugInventory, Path filePath) throws IOException {
        logger.fine("Attempting to write to data file: " + filePath);
        drugInventoryStorage.saveDrugInventory(drugInventory, filePath);
    }
}