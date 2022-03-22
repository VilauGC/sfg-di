package com.vilaugc.sfgdi.controllers;

import com.vilaugc.sfgdi.services.GreetingService;
import com.vilaugc.sfgdi.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
