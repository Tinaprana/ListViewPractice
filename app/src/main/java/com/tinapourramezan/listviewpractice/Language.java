package com.tinapourramezan.listviewpractice;

public class Language {
    String languageName, languageDescription;
    int flagImage;

    public Language(String languageName, String languageDescription, int flagImage) {
        this.languageName = languageName;
        this.languageDescription = languageDescription;
        this.flagImage = flagImage;
    }




    public String getLanguageName() {
        return languageName;
    }

    public String getLanguageDescription() {
        return languageDescription;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public void setFlagImage(int flagImage) {
        this.flagImage = flagImage;
    }
}
