package com.dionext.ex_prog_principles.solid.dependency_inversion.right;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusnessService {
    @Autowired
    private FirstChildBusnessService firstChildBusnessService;
    @Autowired
    private SecondChildBusnessService secondChildBusnessService;

    public void doSomeBusnessWork() {
        firstChildBusnessService.doSomeBusnessWork();
        secondChildBusnessService.doSomeBusnessWork();
    }
}
