package com.org.mmo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
	private int status;
    private String error;
    private String message;
    private String timestamp;
    private String details;	
    
    
}