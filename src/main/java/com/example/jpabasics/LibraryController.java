package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class LibraryController {

    @Autowired  LibrarycardService libraryservice;

    @PostMapping("/addcard")
    public String addcarduser(@RequestBody LibraryCard librarycard){
        return libraryservice.addcarduser(librarycard);

    }
}
