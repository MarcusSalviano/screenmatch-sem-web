package br.com.alura.screenmatch.service;

import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class ConsultaLibreTranslate {
    public static String obterTraducao(String texto) {
        Translator.setUrlApi("https://pt.libretranslate.com/translate");

        String resposta;
        try {
            resposta = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, texto);
        } catch (Exception e) {
            resposta = "Erro na tradução";
        }
        return resposta;
    }
}
