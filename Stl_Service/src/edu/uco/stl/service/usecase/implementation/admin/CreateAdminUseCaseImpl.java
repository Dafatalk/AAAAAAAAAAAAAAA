package edu.uco.stl.service.usecase.implementation.admin;

import edu.uco.stl.crosscutting.messages.Messages.DAOFactory;
import edu.uco.stl.domain.AdminDTO;
import edu.uco.stl.service.usecase.admin.CreateAdminUseCase;


public class CreateAdminUseCaseImpl implements CreateAdminUseCase{

	private final DAOFactory factory;
	
	public CreateAdminUseCaseImpl(DAOFactory factory) {
		this.factory=factory;
	}
	
	
	@Override
	public void execute(AdminDTO admin) {
		//
		
	}

}
