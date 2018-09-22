package com.antonio.loginDAO;

import java.util.List;

import com.antonio.loginDAO.dao.PersonDAO;
import com.antonio.loginDAO.daoImpl.PersonDAOImpl;
import com.antonio.loginDAO.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PersonDAO personDao = new PersonDAOImpl();
        
        List<Person> persons = personDao.getAllPersons();
        
        for(Person person : persons) {
        	System.out.println(person);
        }
    }
}
