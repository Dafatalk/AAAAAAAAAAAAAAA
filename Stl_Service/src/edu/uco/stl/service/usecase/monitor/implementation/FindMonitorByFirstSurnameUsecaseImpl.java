package edu.uco.stl.service.usecase.monitor.implementation;

import java.util.List;

import static edu.uco.stl.crosscutting.helper.ObjectHelper.isNull;
import edu.uco.stl.domain.MonitorDTO;
import edu.uco.stl.service.usecase.monitor.FindMonitorbyFirstSurnameUsecase;

public class FindMonitorByFirstSurnameUsecaseImpl implements FindMonitorbyFirstSurnameUsecase {
	
	private final edu.uco.stl.data.daofactory.DAOFactory factory;
	
	public FindMonitorByFirstSurnameUsecaseImpl(edu.uco.stl.data.daofactory.DAOFactory factory) {
		this.factory=factory;
	}

	@Override
	public MonitorDTO execute(String firstsurname) {
		MonitorDTO result = new MonitorDTO();
		final MonitorDTO monitor = MonitorDTO.create(firstsurname);
		final List<MonitorDTO> results = factory.getMonitorDAO().find(monitor);
		
		if(isNull(result)) {
			result = results.get(0);
		}
		return result;
		
	}


}
