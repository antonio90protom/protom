package com.protom.mytime.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class ModelMapperConfiguration {
	
	@Bean /*ModelMapper si occupa di convertire il Entity in DTO e viceversa */
	public ModelMapper modelMapper () {
		return new ModelMapper();
	}

}
