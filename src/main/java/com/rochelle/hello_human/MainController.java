package com.rochelle.hello_human;
//? Pair Programming -> Dominic Bass

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//& Create an app that will show in the browser either a default value of "human" or with the name provided in the URL query string.

@RestController // signifies that this is now the controller for my app 
// app now knows to use this as a controller

public class MainController {
    // once setup as rest controller now to setup routes -> tell my app what to do when it hits a certain route 
    // route -> when see this route do this 
    // when see this route run this function
    // @RequestMapping("/")
    // public String index() {
    //     return "Hello Human";
    // }

    @RequestMapping("/")
    //~ whenever there is an error focus at the top of the page to see what it is telling you is wrong with your app
                                    // q is the search param -> so this needs to be in the browser
                                    // /?q=something -> /?q=pleasework
                                    // -> it will now work
    // public String index(@RequestParam(value="q") String searchQuery) {
    //     return "You searched for: " + searchQuery;
    // }
    // need to modify it to the param given in the assignment -> name not q -> /?name=Rochelle
    // -> it will work 
    // should say Hello Human when go back to / but it breaks -> need to another attribute -> required=false
        // -> now it will not look for that request param
        // -> want request param to have a default value -> defaultValue = "test"
        // -> now when don't put anything in the browser it will say Hello Human
    // public String index(@RequestParam(value="name", required=false, defaultValue = "Human" ) String searchQuery) {
    //     return "Hello " + searchQuery;
    // }
    
    //& Can you include a "last name" as a parameter and print out both the first and last names?
    public String index(@RequestParam(value = "name", required=false) String searchQuery, @RequestParam(value="last_name", required=false) String searchQuery1) {
        if(searchQuery == null) {
            return "Hello Human";
        } else {
            return "Hello " + searchQuery + " " + searchQuery1;
        }
    }

    
}
