package de.wirvsvirus.testresult.backend.persistence;

import org.springframework.data.repository.CrudRepository;

import de.wirvsvirus.testresult.backend.model.TestResult;

public interface TestResultRepo extends CrudRepository<TestResult, String> {

	
}
