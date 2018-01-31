package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {

    @RequestMapping("/address")

    public String nameList() {

        String output="";
        String[] name=new String[5];




    name[0]="Dave";
    name[1]="Paul";
    name[2]="Kim";
    name[3]="Kate";
    name[4]="Sena";
        output += name[0] + "<br />" + name[1] + "  <br />   " + name[2] +" <br /> "+ name[3] + "   <br />   " + name[4];



        return output;


        }


}
