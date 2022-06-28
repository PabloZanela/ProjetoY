
package DAO;

import Model.Cliente;
import java.util.*;

public class ClienteDAO {

    public static ArrayList<Cliente> MinhaLista = new ArrayList<Cliente>();

    public static int maiorID() {
        
        int maiorID = 0;
        for (int i = 0; i < MinhaLista.size(); i++) {
            if (MinhaLista.get(i).getId() > maiorID) {
                maiorID = MinhaLista.get(i).getId();
            }
        }
        return maiorID;
        
        
    }

}
