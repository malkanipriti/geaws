package com.citiustech.ge.aws.main.bean;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface PatientRepository extends MongoRepository<PatientBean, String> {
	 /**
     * Deletes a PatientBean entry from the database.
     * @param deleted   The deleted PatientBean entry.
     */
    void delete(PatientBean deleted);

    /**
     * Finds all PatientBean entries from the database.
     * @return  The information of all PatientBean entries that are found from the database.
     */
    List<PatientBean> findAll();

    /**
     * Finds the information of a single PatientBean entry.
     * @param id    The id of the requested PatientBean entry.
     * @return      The information of the found PatientBean entry. If no PatientBean entry
     *              is found, this method returns an empty {@link java.util.Optional} object.
     */
    PatientBean findOne(String id);

    /**
     * Saves a new PatientBean entry to the database.
     * @param saved The information of the saved PatientBean entry.
     * @return      The information of the saved PatientBean entry.
     */
    PatientBean save(PatientBean saved);

	
}
