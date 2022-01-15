package com.brianedwards.chucknorrisquotes.controllers;

import com.brianedwards.chucknorrisquotes.services.ChuckNorrisQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisQuoteController {

    private ChuckNorrisQuoteService quoteService;

    public ChuckNorrisQuoteController(ChuckNorrisQuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {
        model.addAttribute("quote", this.quoteService.getCNJoke());
        model.addAttribute("totalJokes", this.quoteService.getTotalNumberOfJokes());
        return "chuckQuote";
    }

}
