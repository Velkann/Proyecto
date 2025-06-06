package BusinessLogic;

import BusinessEntity.UsuarioBE;
import DataAccessObject.UsuarioDAO;
import java.util.List;

public class UsuarioBL implements IBaseBL<UsuarioBE>{

    @Override
    public boolean Create(UsuarioBE input) {
        UsuarioDAO DAO = new UsuarioDAO();
        return DAO.Create(input);
    }

    @Override
    public boolean Update(UsuarioBE input) {
        UsuarioDAO DAO = new UsuarioDAO();
        return DAO.Update(input);
    }

    @Override
    public boolean Delete(String input) {
        UsuarioDAO DAO = new UsuarioDAO();
        return DAO.Delete(input);
    }

    @Override
    public UsuarioBE Read(String input) {
        UsuarioDAO DAO = new UsuarioDAO();
        return DAO.Read(input);
    }
    
    /*public List<UsuarioBE> Listar(){
        ArrayList<UsuarioBE> lst = new ArrayList<>();
        UsuarioDAO userDAO=new UsuarioDAO();
        UsuarioBE userBE1=userDAO.Read("1");
        lst.add(userBE1);
        
        UsuarioBE userBE2=userDAO.Read("2");
        lst.add(userBE2);
        
        UsuarioBE userBE3=userDAO.Read("3");
        lst.add(userBE3);
        
       
        return lst;
    
    }*/
    
}
