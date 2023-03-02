package com.testers.desktop.page;

import org.junit.Assert;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class PageCalculadora {

    private Pattern iconeWindows = new Pattern(System.getProperty("user.dir").concat("/").concat("src/test/resources/imagens/img.png"));
    private Pattern pesquisaWindows = new Pattern(System.getProperty("user.dir").concat("/").concat("src/test/resources/imagens/img_1.png"));
    private Pattern appCalculadora = new Pattern(System.getProperty("user.dir").concat("/").concat("src/test/resources/imagens/appCalculadora.png"));
    private Pattern btn5 = new Pattern(System.getProperty("user.dir").concat("/").concat("src/test/resources/imagens/btn5.png"));
    private Pattern btnMultiplicacao = new Pattern(System.getProperty("user.dir").concat("/").concat("src/test/resources/imagens/btnMultiplicacao.png"));
    private Pattern btnIgual = new Pattern(System.getProperty("user.dir").concat("/").concat("src/test/resources/imagens/btnIgual.png"));
    private Pattern resultadoDe5x5 = new Pattern(System.getProperty("user.dir").concat("/").concat("src/test/resources/imagens/resultadoDe5x5.png"));
    private Pattern resultadoDe5x10 = new Pattern(System.getProperty("user.dir").concat("/").concat("src/test/resources/imagens/resultadoDe5x10.png"));


    public void acessaCalculadora() {
        Screen tela = new Screen();

        try {
            /** Abrir o app: **/
            App.open("C:\\Windows\\System32\\calc.exe");

            /** Outra forma de abrir o app: **/
//            File appCalculadora = new File("C:\\Windows\\System32\\calc.exe");
//            Desktop.getDesktop().open(appCalculadora);

            /** Abrindo o App manualmente: **/
//          tela.click(pesquisaWindows);
//          tela.type(pesquisaWindows, "Calculadora");
//          tela.click(appCalculadora);
            tela.click(btn5);
            tela.click(btnMultiplicacao);
            tela.click(btn5);
            tela.click(btnIgual);

            Assert.assertNotNull(tela.getScreen().exists(resultadoDe5x5));

            /** Encerra o processo da calculadora, pois o App.close() não funcionou: **/
            App.open("taskkill /f /im CalculatorApp.exe");

        } catch (FindFailed e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Não foi possível inicializar a calculadora");
        }


    }
}
