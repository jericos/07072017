package com.ea.test.steps;

import com.ea.framework.base.Base;
import cucumber.api.java.en.And;

public class TestSteps  extends Base {
    @And("^Second Step to do$")
    public void secondStepToDo() {
        System.out.println("Feature 1 - Scenario 1 - Paso 2 correctamente");
    }

    @And("^Third Step to do$")
    public void thirdStepToDo() {
        System.out.println("Feature 1 - Scenario 1 - Paso 3 correctamente");
    }

    @And("^Zero Step to do$")
    public void zeroStepToDo() {
        System.out.println("Feature 2 - Scenario 1 - Paso 2 correctamente");
    }

    @And("^First Step to do$")
    public void firstStepToDo() {
        System.out.println("Feature 2 - Scenario 1 - Paso 3 correctamente");
    }
}
