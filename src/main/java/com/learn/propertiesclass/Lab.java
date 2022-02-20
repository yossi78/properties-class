package com.learn.propertiesclass;


import com.learn.propertiesclass.properties.RestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Lab {


    private RestProperties restProperties;

    @Autowired
    public Lab(RestProperties restProperties) {
        this.restProperties = restProperties;
    }

    @PostConstruct
    public void x(){
        System.out.println("");
    }
}
