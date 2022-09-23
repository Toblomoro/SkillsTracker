package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("skills")
public class SkillsController {
    @GetMapping("home")
    public String homePage() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker</h1>" +
                "<h2>We have a few skills we would like you to learn. Here is the list!</h2> " +
                "<ol>" +
                "<li> Java </li> " +
                "<li> Python </li> " +
                "<li> JavaScript </li> " +
                "</ol>" +
                "<p>Click <a href ='form'>here</a> to choose your favorites." +
                "</body>" +
                "</html>";

    }
    @GetMapping("form")
    public String formPage(){
        return "<html>" +
                "<body>" +
                "<form action = 'printOut' method = 'post'" +
                "<label id = 'name' style=font-size:24px; color:#538b01; font-weight:bold; font-style:italic;> Name </label><br>" +
                "<input type='text' name = 'name'/><br>" +
                "<label id = 'first' style=font-size:24px; color:#538b01; font-weight:bold; font-style:italic;> My first choice: </label><br>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "</select><br>" +
                "<label id = 'second' style=font-size:24px; color:#538b01; font-weight:bold; font-style:italic;> My second choice: </label><br>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "</select><br>" +
                "<label id = 'third' style=font-size:24px; color:#538b01; font-weight:bold; font-style:italic;> My third choice: </label><br>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit'>"+
                "</body>" +
                "</html>";
    }
    @PostMapping("printOut")
    public String output(@RequestParam String name, String firstChoice, String secondChoice, String thirdChoice){
        return "<html>" +
                "<body>" +
                "<h1>"+ name+ "'s choices:</h1>" +
                "<ol>" +
                "<li>"+firstChoice+"</li>" +
                "<li>"+secondChoice+"</li>" +
                "<li>"+firstChoice+"</li>" +
                "</ol>" +
                "<body>" +
                "<html>";

    }

}
