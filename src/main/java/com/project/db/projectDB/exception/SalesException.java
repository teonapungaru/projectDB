package com.project.db.projectDB.exception;

public class SalesException extends GlobalException {
    public SalesException(){
    }
    public SalesException(String s) {
        super(s);
    }

    public SalesException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public SalesException(Throwable throwable) {
        super(throwable);
    }

    public SalesException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
