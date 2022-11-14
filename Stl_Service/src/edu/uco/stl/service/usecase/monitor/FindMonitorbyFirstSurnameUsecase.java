package edu.uco.stl.service.usecase.monitor;

import java.util.List;

import edu.uco.stl.domain.MonitorDTO;

public interface FindMonitorbyFirstSurnameUsecase {
	MonitorDTO execute(String firstsurname );

}
