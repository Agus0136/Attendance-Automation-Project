package sample.bll;

import sample.dal.DALFacade;
import sample.dal.IDALFacade;

import java.io.IOException;

public class BLLFacade implements IBLLFacade {

    private IDALFacade dalFacade;

    public BLLFacade() throws IOException {
        dalFacade = new DALFacade();
    }
}
