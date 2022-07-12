package com.sapient.endur.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.sapient.endur.dao.EmployeeDAO;
import com.sapient.endur.dao.EmployeeDaoImpl;
import com.sapient.endur.model.Employee;
/**
 * 
 * @author Admin
 * The methods of EmployeeServiceImpl class will be calling corresponding 
 * methods EmployeeDaoImpl class.
 * 
 * The methods of Service layer are calling corresponding methods of DAO layer
 */
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDao= new EmployeeDaoImpl();
	private Logger logger= Logger.getLogger(EmployeeServiceImpl.class);
	private Validator validator= new Validator();

	@Override
	public Integer addEmployee(Employee employee) throws EmployeeException {
		try {
			/*this method receives employee object from UI layer, In the service layer
			 * we can validate the employee object before passing it to DAO layer method.
			 * This is called sanitizing the data
			 * 
			 * 
			 */
			if(validateEmployee(employee)) {
				logger.info("Employee object is valid");
				return employeeDao.addEmployee(employee);
			}else {
				logger.warn("Invalid Employee Details");
				return null;
			}
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage(),e);
		}
	}

	private Boolean validateEmployee(Employee employee) throws SQLException {
		if(validator.isValidEname(employee.getEname())) {
			if(validator.isValidJob(employee.getJob())) {
				if(validator.isValidHiredate(employee.getHiredate())) {
					if(validator.isValidEmail(employee.getEmail())) {
						if(validator.isValidMobile(employee.getMobile())) {
							if(validator.isValidDname(employee.getDname())) {		
								logger.info("In service layer, employee object is valid");
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public Integer deleteEmployee(Integer empno) throws EmployeeException {
		try {
			return employeeDao.deleteEmployee(empno);	

		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage(),e);
		}
	}

	@Override
	public Integer updateEmployee(Employee employee) throws EmployeeException {
		try {
			if(validateEmployee(employee)) {
				return employeeDao.updateEmployee(employee);
			}
			logger.warn("Invalid Employee Details");
			return null;
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage(),e);
		}
	}

	@Override
	public Employee getEmployeeById(Integer empno) throws EmployeeException {
		try {
			return employeeDao.getEmployeeById(empno)	;

		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage(),e);
		}
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		try {
			//based on business rules, the data can be filtered
			return employeeDao.getAllEmployees();	

		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage(),e);
		}
	}

	@Override
	public Integer getLatestEmployeeId() throws EmployeeException {
		try {

			return employeeDao.getLatestEmployeeId();	

		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage(),e);
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage(),e);
		}
	}

}
