package com.epam.mjc;

public class IllegArgUserException extends IllegalArgumentException {

    public IllegArgUserException(long id) {
        super("Could not find student with ID " + id);
    }

}
