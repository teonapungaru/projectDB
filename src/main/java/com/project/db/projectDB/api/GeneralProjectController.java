package com.project.db.projectDB.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(GeneralProjectController.API_NAME)
public class GeneralProjectController {
    public static final String API_NAME = "/api/v1";
}
