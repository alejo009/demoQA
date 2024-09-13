package co.com.screenplay.project.stepDefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenWebStep {
    @Before
    public void setTheStage(){OnStage.setTheStage(new OnlineCast());}
}
