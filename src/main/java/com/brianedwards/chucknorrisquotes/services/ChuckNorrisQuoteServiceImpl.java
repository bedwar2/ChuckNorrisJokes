package com.brianedwards.chucknorrisquotes.services;

//import com.brianedwards.chucknorrisquotes.dao.ChuckNorrisQuotes;
import com.brianedwards.chucknorrisquotes.dao.ChuckNorrisRevisedQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
@Primary
public class ChuckNorrisQuoteServiceImpl implements ChuckNorrisQuoteService {

    ChuckNorrisRevisedQuotes quotes = new ChuckNorrisRevisedQuotes();
    public ChuckNorrisQuoteServiceImpl() {

    }

    @Override
    public String getCNJoke() {

        return quotes.getRandomQuote();
    }

    public Integer getTotalNumberOfJokes() {
        return quotes.totalJokes();
    }
}
