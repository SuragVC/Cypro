package com.cypro.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="KeyAutoGenerator")
public class PrimaryKeyGenerator {
	@Id
	private Integer keyID;
	private Integer nextValue;
}
