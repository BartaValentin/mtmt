package com.example.demo.exceptions;

public class PublicationException extends RuntimeException
{
    public PublicationException() {
        super();
    }

    public PublicationException(String message) {
        super(message);
    }

    public PublicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PublicationException(Throwable cause) {
        super(cause);
    }
}
