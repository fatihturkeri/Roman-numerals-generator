package com.spring.roman.numerals.controller;

import com.spring.roman.numerals.domain.RomanNumber;
import com.spring.roman.numerals.service.RomanNumberService;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author fatih
 */
@Controller
public class RomanNumberController {

    @Inject
    private RomanNumberService romanNumberService;

    @RequestMapping(value = "/mainPage")
    public ModelAndView mainPage() {
        return new ModelAndView("mainPage", "romanNumber", new RomanNumber());
    }

    @RequestMapping(value = "/convertRomanNumber", method = RequestMethod.GET)
    public @ResponseBody
    String convertRomanNumber(@RequestParam String number) {

        Integer numberInt;
        if (number != null) {
            numberInt = Integer.parseInt(number);
            return romanNumberService.getRomanNumeral(numberInt);
        } else {
            return "Number can not be null.";
        }
    }

    public RomanNumberService getRomanNumberService() {
        return romanNumberService;
    }

    public void setRomanNumberService(final RomanNumberService romanNumberService) {
        this.romanNumberService = romanNumberService;
    }
}
