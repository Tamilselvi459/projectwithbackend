package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrarycardService {

    @Autowired LibrarycardRepository libraryrepository;


    public String addcarduser(LibraryCard librarycard) {
        libraryrepository.save(librarycard);
        return "added successfully";
    }
}
