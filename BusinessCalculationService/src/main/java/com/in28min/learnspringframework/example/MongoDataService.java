package com.in28min.learnspringframework.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDataService implements DataService {

    public int[] dataRetrieve(){

        return new int[] {1,2,3,4,5};

    }
    
}
