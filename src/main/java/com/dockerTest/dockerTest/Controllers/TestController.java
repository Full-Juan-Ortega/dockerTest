package com.dockerTest.dockerTest.Controllers;


import org.springframework.web.bind.annotation.*;

/*Testing Controller for ensure correctly working */

@RestController
public class TestController {

    @GetMapping("/test/get")
    public String simpleGetTest() {
        return "Greetings from Spring Boot asdasd!";
    }

    @GetMapping("/test/get-path/{randomParam}")
    public String getPath(@PathVariable("randomParam") String entryTest) {
        return "getUrlParamTest : " +entryTest;
    }

    @PutMapping("/test/put/{randomParam}")
    public String putTest (@PathVariable("randomParam") String entryTest){
        return "putTest : " + entryTest;
    }

    @PostMapping("/test/post")
    public String postTest (@RequestBody String entryTest){
        return "postRequestBodyTest : " + entryTest;
    }

}
