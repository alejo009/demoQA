package testrunner;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class TestUnit implements Task {

    private String greatPlace;
    private int numberProject;


    public TestUnit(String greatPlace,int numberProject){
        this.greatPlace = greatPlace;
        this.numberProject = numberProject;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
