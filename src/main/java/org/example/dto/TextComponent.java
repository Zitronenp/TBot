package org.example.dto;


public class TextComponent implements Component {
    private final String text;

    public TextComponent(String text) {
        this.text = text;
    }
    public TextComponent(TextComponent textComponent) {
        this.text = textComponent.text;
    }
    public String getText() {
        return text;
    }
}