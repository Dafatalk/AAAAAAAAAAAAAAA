package edu.uco.stl.service.usecase.observation;

import edu.uco.stl.domain.ObservationDTO;

public interface CreateObservationUseCase {

	void execute(ObservationDTO observation);
}
