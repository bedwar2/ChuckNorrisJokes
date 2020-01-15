package com.brianedwards.chucknorrisquotes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
@Primary
public class ChuckNorrisQuoteServiceImpl implements ChuckNorrisQuoteService {

    public ChuckNorrisQuoteServiceImpl() {

    }

    @Override
    public String getCNJoke() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
