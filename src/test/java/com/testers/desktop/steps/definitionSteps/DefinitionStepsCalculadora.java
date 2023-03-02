package com.testers.desktop.steps.definitionSteps;

import com.testers.desktop.steps.serenity.CalculadoraSteps;
import cucumber.api.java.pt.Dado;
import net.thucydides.core.annotations.Steps;


public class DefinitionStepsCalculadora {

    @Steps
    CalculadoraSteps calculadoraSteps;

    @Dado("^que efetuo um cálculo na calculadora do windows$")
    public void queAcessoACalculadoraDoWindows() {
        calculadoraSteps.acessaCalculadora();

    }



}
