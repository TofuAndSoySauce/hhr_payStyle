package com.payStyle.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="withdraws")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@SequenceGenerator(
		name = "USER_SEQ_GENERATO_W"
		, sequenceName = "USER_SEQ_W"
		, initialValue = 1
		, allocationSize = 1
		)
public class Withdraw {//지출
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ_GENERATOR_W")
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name="userId")
	private Users users;
	
	@Column
	private String bankName;
	
	@Column
	private String cate;
	
	@Column
	private int value;
	
	
	
	@CreationTimestamp
	private Timestamp createDate;

}
