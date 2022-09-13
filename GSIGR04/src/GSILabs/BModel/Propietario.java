/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GSILabs.BModel;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author adria
 */
public class Propietario extends Usuario{
  private ArrayList<Local> locales;

    public Propietario(String nick, String clave, Date fechaNac) {
        super(nick, clave, fechaNac);
    }
}
