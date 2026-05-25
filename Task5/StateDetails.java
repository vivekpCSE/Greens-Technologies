
package org.lang;

public class StateDetails {

    public void southIndia() {
        System.out.println("South Side");
    }

    public void northIndia() {
        System.out.println("North SIde");
    }

    public static void main(String[] args) {

       
        LanguageInfo language = new LanguageInfo();

        language.tamilLanguage();
        language.englishLanguage();
        language.hindiLanguage();

        StateDetails state = new StateDetails();
        state.southIndia();
        state.northIndia();
    }
}