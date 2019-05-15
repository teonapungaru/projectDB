package com.project.db.projectDB.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomerException extends GlobalException {
    public CustomerException(){
    }
    public CustomerException(String s) {
        super(s);
    }

    public CustomerException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public CustomerException(Throwable throwable) {
        super(throwable);
    }

    public CustomerException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
