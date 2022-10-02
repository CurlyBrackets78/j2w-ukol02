package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.InputStream;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

@Controller
public class CitatyController {

  private final Random random = new Random();


  @GetMapping("/")
  public ModelAndView viewQuote() {

    int randomNumber = random.nextInt(7) + 1;

    List<String> quoteItem = List.of(
      "Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
      "A user interface is like a joke. If you have to explain it, it's not that good.",
      "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
      "I have a joke on programming but it only works on my computer.",
      "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
      "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
      "Programmer (noun.): A machine that turns coffee into code.",
      "Real programmers count from 0."
      );


   ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("quote", quoteItem.listIterator().nextIndex());
    modelAndView.addObject("bgImage", String.format("/images/obr-%d.jpg", randomNumber));

    return modelAndView;
  }


}
