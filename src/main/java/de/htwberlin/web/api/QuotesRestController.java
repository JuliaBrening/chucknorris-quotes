package de.htwberlin.web.api;

import de.htwberlin.service.QuotesService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesRestController {

    private final QuotesService quotesService;

    public QuotesRestController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping(path = "/api/v1/quotes")
    public ResponseEntity<QuoteResponse> fetchQuote(@RequestParam int index) {
        String quote = quotesService.getQuote(index);
        QuoteResponse response = new QuoteResponse(quote);
        return ResponseEntity.ok(response);
    }
}
