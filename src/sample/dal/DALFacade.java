package sample.dal;

import sample.dal.DAO.Students2DAO;
import sample.dal.DAO.StudentsDAO;

public class DALFacade implements IDALFacade {

    private StudentsDAO studentsDAO;
    private Students2DAO students2DAO;
}
