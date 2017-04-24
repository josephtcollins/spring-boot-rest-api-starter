package com.project.name.Package;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jcollins on 4/23/17.
 */
@RestController
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getString() {
        return "This is a test";
    }

    @RequestMapping(value = "/item", method = RequestMethod.PUT)
    public String putString(@RequestParam("data") String queryParam) {
        return queryParam;
    }

}
