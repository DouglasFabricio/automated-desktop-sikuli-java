package com.testers.desktop.steps.serenity;

import com.testers.desktop.page.PageCalculadora;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class CalculadoraSteps {

    @Steps
    PageCalculadora pageCalculadora;

    @Step
    public void acessaCalculadora() {
        pageCalculadora.acessaCalculadora();
//        pageCalculadora.validaResultado();

    }
}
