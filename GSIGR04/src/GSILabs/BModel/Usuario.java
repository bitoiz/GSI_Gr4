/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GSILabs.BModel;

import java.util.Date;

/**
 *
 * @author adria
 */
public class Usuario {
  
  private String nick;
  private String clave;
  private Date fechaNac;
  
  public Usuario(String nick, String clave, Date fechaNac){
      this.nick = nick;
      this.clave = clave;
      this.fechaNac = fechaNac;
  }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
  
  
}
