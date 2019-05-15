package com.project.db.projectDB.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CarException extends GlobalException {
    public CarException(){
    }
    public CarException(String s) {
        super(s);
    }

    public CarException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public CarException(Throwable throwable) {
        super(throwable);
    }

    public CarException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
