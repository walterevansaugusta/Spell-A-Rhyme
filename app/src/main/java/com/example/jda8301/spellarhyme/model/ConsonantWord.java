package com.example.jda8301.spellarhyme.model;

/**
 * Created by YizraGhebre on 1/23/19.
 */

public class ConsonantWord {
    private String stringName;
    private String category;
    private int[] sound;
    private int[] silentLetters;
    private int[] consonants;
    private int targetConsonant;

    public ConsonantWord(String stringName, String category, int[] sound, int[] silentLetters, int[] consonants, int targetConsonant) {
        this.stringName = stringName;
        this.category = category;
        this.sound = sound;
        this.silentLetters = silentLetters;
        this.consonants = consonants;
        this.targetConsonant = targetConsonant;
    }

    public String getStringName() {
        return stringName;
    }

    public void setStringName(String stringName) {
        this.stringName = stringName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int[] getSound() {
        return sound;
    }

    public void setSound(int[] sound) {
        this.sound = sound;
    }

    public int[] getSilentLetters() {
        return silentLetters;
    }

    public void setSilentLetters(int[] silentLetters) {
        this.silentLetters = silentLetters;
    }

    public int[] getConsonants() {
        return consonants;
    }

    public void setConsonants(int[] consonants) {
        this.consonants = consonants;
    }

    public int getTargetConsonant() {
        return targetConsonant;
    }

    public void setTargetConsonant(int targetConsonant) {
        this.targetConsonant = targetConsonant;
    }
}
