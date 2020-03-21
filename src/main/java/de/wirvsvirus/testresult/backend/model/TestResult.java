package de.wirvsvirus.testresult.backend.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class TestResult {

	String id;
	Result status;
	String name;
	String contact;
	
	public enum Result { POSITIVE, NEGATIVE, PENDING, NONE}
	
}
