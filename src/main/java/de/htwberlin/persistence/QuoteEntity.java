package de.htwberlin.persistence;

import javax.persistence.Entity;

public class QuoteEntity {

    private String quote;

    public QuoteEntity(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
