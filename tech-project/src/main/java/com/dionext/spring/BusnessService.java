package com.dionext.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class BusnessService {
    @Autowired
    private FirstChildBusnessService firstChildBusnessService;
    @Autowired
    private SecondChildBusnessService secondChildBusnessService;

    public void doSomeBusnessWork() {
        firstChildBusnessService.doSomeBusnessWork();
        secondChildBusnessService.doSomeBusnessWork();
    }
}
