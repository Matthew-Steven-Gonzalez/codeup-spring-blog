package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiceController {
    @GetMapping("/roll-dice")
    public String rollDiceForm(){
        return "diceroll";
    }

    @GetMapping("/roll-dice/{guess}")
    public String theGameInternalGuess(@PathVariable int guess, Model model){
        int winningNumber = (int) (Math.random()*6+1);
        if( winningNumber == guess){
            model.addAttribute("results","You WON!!! Congrats");
            model.addAttribute("guess",guess);
            model.addAttribute("correctNumber",winningNumber);
        }
        else{
            model.addAttribute("results","Sorry you lost! Play again?");
            model.addAttribute("guess",guess);
            model.addAttribute("correctNumber",winningNumber);
        }
        return "diceResults";
    }

    @PostMapping("/roll-dice")
    public String theGame(@RequestParam(name = "guess") int guess, Model model){
        int winningNumber = (int) (Math.random()*6+1);
        if( winningNumber == guess){
            model.addAttribute("results","You WON!!! Congrats");
            model.addAttribute("guess",guess);
            model.addAttribute("correctNumber",winningNumber);
        }
        else{
            model.addAttribute("results","Sorry you lost! Play again");
            model.addAttribute("guess",guess);
            model.addAttribute("correctNumber",winningNumber);
        }
        return "diceResults";
    }
}
