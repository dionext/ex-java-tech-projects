package com.dionext.ex_prog_principles.solid.dependency_inversion.wrong;

public class Main {
    CachManager cachManager;
    AnotherManager anotherManager;
    public static void main(String[] args) {
        Main main = new Main();
        main.doWork();
    }
    public Main(){
        cachManager = new CachManager();
        anotherManager = new AnotherManager();
    }
    public void doWork(){
        BusnessService busnessService = new BusnessService(cachManager, anotherManager);
        busnessService.doSomeBusnessWork();
    }
}
class CachManager {
    public void doSomeWork(){}
}
class AnotherManager {
    public void doAnotherWork(){}
}
class BusnessService {
    private CachManager cachManager;
    private AnotherManager anotherManager;
    private FirstChildBusnessService firstChildBusnessService;
    private SecondChildBusnessService secondChildBusnessService;
    public BusnessService(CachManager cachManager, AnotherManager anotherManager){
        this.cachManager = cachManager;
        this.anotherManager = anotherManager;
        firstChildBusnessService = new FirstChildBusnessService(cachManager, anotherManager);
        secondChildBusnessService = new SecondChildBusnessService(cachManager, anotherManager);
    }
    public void doSomeBusnessWork(){
        firstChildBusnessService.doSomeBusnessWork();
        secondChildBusnessService.doSomeBusnessWork();
    }
}
class FirstChildBusnessService {
    private CachManager cachManager;
    private AnotherManager anotherManager;
    public FirstChildBusnessService(CachManager cachManager, AnotherManager anotherManager) {
        this.cachManager = cachManager;
        this.anotherManager = anotherManager;
    }
    public void doSomeBusnessWork(){
        cachManager.doSomeWork();
        anotherManager.doAnotherWork();
    }
}
class SecondChildBusnessService{
    private CachManager cachManager;
    private AnotherManager anotherManager;
    public SecondChildBusnessService(CachManager cachManager, AnotherManager anotherManager){
        this.cachManager = cachManager;
        this.anotherManager = anotherManager;
    }
    public void doSomeBusnessWork(){
        cachManager.doSomeWork();
        anotherManager.doAnotherWork();
    }
}
