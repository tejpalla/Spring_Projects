package com.in28min.learnspringframework.example;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessLogic {

    private DataService dataService;

    public BusinessLogic(DataService dataService){
        super();
        this.dataService = dataService;

    }
    	public int findMax() {
		return Arrays.stream(dataService.dataRetrieve()).max().orElse(0);
	}
    
}
