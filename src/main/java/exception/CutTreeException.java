package exception;

public class CutTreeException extends RuntimeException{
    
    public CutTreeException(){};
    
    public CutTreeException(String message){
        super(message);
    }
}
