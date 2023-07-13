package com.in28min.learnspringframework.example;

import org.springframework.stereotype.Component;

@Component
public class SQLDataService implements DataService {

    public int[] dataRetrieve(){

        return new int[] {1,2,3,4,5};

    }
    
}