package com.TJ.SMS.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "school-session")
public class SchoolSession {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	Long slno;
	String session = null;
	@Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	Date sessionFrom;
	@Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	Date sessionTo;
	
	@PrePersist
	private void prePush() {
		if(this.session == null) {
			this.session=""+(1900+this.sessionFrom.getYear())+"-"+(1900+this.sessionTo.getYear());
			}
	}
}
