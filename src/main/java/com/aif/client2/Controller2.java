package com.aif.client2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @GetMapping("/callClient2")
    public ResponseEntity<String> callFirst() throws Exception {
        return new ResponseEntity<String>( "Hello From Client 2 ", HttpStatus.OK);
    }

    @GetMapping("/callClient2OutSide")
    public ResponseEntity<String> callSecond() throws Exception {
        return new ResponseEntity<String>( "Hello From Client 2 From Client 1 ", HttpStatus.OK);
    }

}
