package edu.uco.stl.crosscutting.exception.crosscutting;

import edu.uco.stl.crosscutting.exception.enumeration.LayerException;
import edu.uco.stl.crosscutting.execption.StlCustomException;

public class CrosscuttingCustomException extends StlCustomException {

	private static final long serialVersionUID = 2L;

	protected CrosscuttingCustomException(String userMessage, String technicalMessage,
			Throwable rootException) {
		super(userMessage, LayerException.CROSSCUTING, technicalMessage, rootException);
	}

	public static final StlCustomException CreateUserException(final String userMessage) {
		return new CrosscuttingCustomException(userMessage, userMessage, new Exception());

	}

	public static final StlCustomException CreateTechnicalException(final String technicalMessage) {
		return new CrosscuttingCustomException(null, technicalMessage, new Exception());

	}

	public static final StlCustomException CreateTechnicalException(final String technicalMessage,
			final Exception rootException) {
		return new CrosscuttingCustomException(null, technicalMessage, rootException);

	}

	public static final StlCustomException Create(final String userMessage, final String technicalMessage) {
		return new CrosscuttingCustomException(userMessage, technicalMessage, new Exception());

	}

	public static final StlCustomException Create(final String userMessage, final String technicalMessage,
			final Exception rootException) {
		return new CrosscuttingCustomException(userMessage, technicalMessage, rootException);
	}

}
