package com.project.db.projectDB.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(GeneralProjectController.API_NAME)
public class GeneralProjectController {
    public static final String API_NAME = "/api/v1";
}
