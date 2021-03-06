package com.chaits.microservices.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name="Exchange_Value")
@Data
@AllArgsConstructor
public class ExchangeValue {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	@Column(name="conversion_multiple")
	private BigDecimal conversionMultiple;
	
	@Column(name="port")  
	private int port;  
}
