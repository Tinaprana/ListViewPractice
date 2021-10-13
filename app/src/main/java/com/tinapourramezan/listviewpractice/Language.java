package com.tinapourramezan.listviewpractice;

public class Language {
    String languageName, languageDescription;

    public Language(String languageName, String languageDescription) {
        this.languageName = languageName;
        this.languageDescription = languageDescription;
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
}
