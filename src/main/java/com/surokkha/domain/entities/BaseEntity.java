package com.surokkha.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@SuperBuilder
public abstract class BaseEntity implements Serializable {
	
	@CreationTimestamp
	@Temporal (TemporalType.TIMESTAMP)
	@Column (nullable = false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Temporal (TemporalType.TIMESTAMP)
	@Column ()
	private Date updatedAt;
	
}
