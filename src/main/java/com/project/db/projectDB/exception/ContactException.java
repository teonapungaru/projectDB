package com.project.db.projectDB.exception;

public class ContactException extends Exception{
    public ContactException(){
    }
    public ContactException(String s) {
        super(s);
    }

    public ContactException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ContactException(Throwable throwable) {
        super(throwable);
    }

    public ContactException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
