package com.dionext.st;

public class MainWithStatic {
    private static CachManager cachManager;
    private static AnotherManager anotherManager;
    public static void main(String[] args) {
        cachManager = new CachManager();
        anotherManager = new AnotherManager();

        MainWithStatic main = new MainWithStatic();
        main.doWork();
    }
    public void doWork(){
        BusnessService busnessService = new BusnessService();
        busnessService.doSomeBusnessWork();
    }

    public static CachManager getCachManager() {
        return cachManager;
    }

    public static AnotherManager getAnotherManager() {
        return anotherManager;
    }
}
class CachManager {
    public void doSomeWork(){}
}
class AnotherManager {
    public void doAnotherWork(){}
}
class BusnessService {
    private FirstChildBusnessService firstChildBusnessService;
    private SecondChildBusnessService secondChildBusnessService;
    public BusnessService(){
        firstChildBusnessService = new FirstChildBusnessService();
        secondChildBusnessService = new SecondChildBusnessService();
    }
    public void doSomeBusnessWork(){
        firstChildBusnessService.doSomeBusnessWork();
        secondChildBusnessService.doSomeBusnessWork();
    }
}
class FirstChildBusnessService {
    public void doSomeBusnessWork(){
        CachManager cachManager = MainWithStatic.getCachManager();
        AnotherManager anotherManager = MainWithStatic.getAnotherManager();
        cachManager.doSomeWork();
        anotherManager.doAnotherWork();
    }
}
class SecondChildBusnessService{
    public void doSomeBusnessWork(){
        CachManager cachManager = MainWithStatic.getCachManager();
        AnotherManager anotherManager = MainWithStatic.getAnotherManager();
        cachManager.doSomeWork();
        anotherManager.doAnotherWork();
    }
}

