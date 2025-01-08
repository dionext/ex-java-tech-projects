package com.dionext.ex_prog_principles.solid.dependency_inversion.right;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstChildBusnessService {
    @Autowired
    private CachManager cachManager;
    @Autowired
    private AnotherManager anotherManager;

    public FirstChildBusnessService() {
    }

    public void doSomeBusnessWork() {
        cachManager.doSomeWork();
        anotherManager.doAnotherWork();
    }
}
