package com.example.D.S3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class BotController {

//    https://ds33bot.herokuapp.com/hello
    @GetMapping("/hello")
    public String hello () {

        try {
            Desktop d=Desktop.getDesktop();

            d.browse(new URI("https://ds33bot.herokuapp.com/hello"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (URISyntaxException use) {
            use.printStackTrace();
        }



        return "hello";
    }


}
