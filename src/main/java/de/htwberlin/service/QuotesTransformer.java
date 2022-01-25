package de.htwberlin.service;

import de.htwberlin.persistence.QuoteEntity;
import de.htwberlin.web.api.QuoteResponse;

public class QuotesTransformer {
    public QuoteResponse transformEntity(QuoteEntity quoteEntity) {
        return new QuoteResponse(quoteEntity.getQuote());
    }
}
