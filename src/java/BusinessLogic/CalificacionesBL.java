package BusinessLogic;
import BusinessEntity.CalificacionesBE;
import DataAccessObject.CalificacionesDAO;

public class CalificacionesBL implements IBaseBL<CalificacionesBE>{

    @Override
    public boolean Create(CalificacionesBE input) {
        CalificacionesDAO DAO = new CalificacionesDAO();
        return DAO.Create(input);
    }

    @Override
    public boolean Update(CalificacionesBE input) {
        CalificacionesDAO DAO = new CalificacionesDAO();
        return DAO.Update(input);
    }

    @Override
    public boolean Delete(String input) {
        CalificacionesDAO DAO = new CalificacionesDAO();
        return DAO.Delete(input);
    }

    @Override
    public CalificacionesBE Read(String input) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
