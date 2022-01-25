package de.htwberlin.service;

import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuotesService{

    @Override
    public String getQuote(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("bla");
        }
        return getQuote(index);
    }
}
