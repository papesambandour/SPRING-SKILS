package metier;

import dao.IDao;

public class MetierImp implements IMetier{
    private IDao dao  ;
    public double calcule() {
        double nb = dao.getValue();
        return 6 *  nb;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
