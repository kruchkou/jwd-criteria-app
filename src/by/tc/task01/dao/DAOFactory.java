package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

import java.io.FileNotFoundException;
import java.io.IOException;

public final class DAOFactory {

	private static DAOFactory instance = new DAOFactory(); //Пришлось сделать не Singleton из-за исключений
	private ApplianceDAO applianceDAO;

	private DAOFactory() {}

	public ApplianceDAO getApplianceDAO() throws FileNotFoundException{
		applianceDAO = new ApplianceDAOImpl();
		return applianceDAO;
	}

	public static DAOFactory getInstance() {
		return new DAOFactory();
	}
}
