package Exceptions;
//Unchecked Custom Exception
public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String message){
        super(message);
    }
}
