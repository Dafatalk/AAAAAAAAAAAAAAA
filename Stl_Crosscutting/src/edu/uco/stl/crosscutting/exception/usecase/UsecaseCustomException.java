package edu.uco.stl.crosscutting.exception.usecase;

import static edu.uco.stl.crosscutting.helper.StringHelper.EMPTY;
import edu.uco.stl.crosscutting.exception.enumeration.LayerException;
import edu.uco.stl.crosscutting.execption.StlCustomException;


public class UsecaseCustomException extends StlCustomException {

    private static final long serialVersionUID = -3691429994161697127L;

	protected UsecaseCustomException(String userMessage, String technicalMessage, Throwable rootException) {
		super(userMessage,LayerException.SERVICE, technicalMessage, rootException );
	}

	public static final StlCustomException CreateUserException(final String userMessage) {
	    return new UsecaseCustomException(userMessage, userMessage, new Exception());
	    
	}
	
	public static final StlCustomException CreateTechnicalException(final String technicalMessage) {
	    return new UsecaseCustomException(EMPTY, technicalMessage, new Exception());
	    
	}
	public static final StlCustomException CreateTechnicalException(final String technicalMessage, final Exception rootException) {
	    return new UsecaseCustomException(EMPTY, technicalMessage,rootException);
	    
	}
	public static final StlCustomException CreateBusinessException(final String businessMessage, final Exception rootException) {
	    return new UsecaseCustomException(businessMessage, EMPTY,rootException);
	    
	}
	public static final StlCustomException Create(final String userMessage, final String technicalMessage) {
	    return new UsecaseCustomException(userMessage, technicalMessage, new Exception());
	    
	}
	public static final StlCustomException Create(final String userMessage, final String technicalMessage, final Exception rootException ) {
	    return new UsecaseCustomException(userMessage, technicalMessage, rootException);
	}
	public static final StlCustomException wrapException(final String message, final StlCustomException exception){
            if(exception.isTechinalException()){
                throw UsecaseCustomException.CreateBusinessException(message, exception);
            }
            return exception;
	}
}

    
