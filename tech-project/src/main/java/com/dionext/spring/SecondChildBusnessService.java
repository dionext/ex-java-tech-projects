package com.dionext.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SecondChildBusnessService{
    @Autowired
    private CachManager cachManager;
    @Autowired
    private AnotherManager anotherManager;
    public SecondChildBusnessService(){
    }
    public void doSomeBusnessWork(){
        cachManager.doSomeWork();
        anotherManager.doAnotherWork();
    }
}

