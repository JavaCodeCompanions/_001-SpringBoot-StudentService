package com.javaCodeCompanions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "STUDENT")
public class Student {
	@Id
	private String stdId;
	private String stdName;
	private String sdtClass;
	private Integer stdAge;
}
