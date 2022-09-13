/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GSILabs.BSystem;

import GSILabs.BModel.Bar;
import GSILabs.BModel.Cliente;
import GSILabs.BModel.Contestacion;
import GSILabs.BModel.Direccion;
import GSILabs.BModel.Local;
import GSILabs.BModel.Propietario;
import GSILabs.BModel.Pub;
import GSILabs.BModel.Reserva;
import GSILabs.BModel.Reservable;
import GSILabs.BModel.Restaurante;
import GSILabs.BModel.Review;
import GSILabs.BModel.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author adria
 */
public class BusinessSystem implements LeisureOffice{

    @Override
    public boolean nuevoUsuario(Usuario u) {
        if(u.getNick().length() > 3 && u.get){
            
        }
    }

    @Override
    public boolean eliminaUsuario(Usuario u) {
        
    }

    @Override
    public boolean modificaUsuario(Usuario u, Usuario nuevoU) {
        
    }

    @Override
    public boolean existeNick(String nick) {
      
    }

    @Override
    public Usuario obtenerUsuario(String nick) {
       
    }

    @Override
    public boolean nuevaReview(Review r) {
       
    }

    @Override
    public boolean eliminaReview(Review r) {
        
    }

    @Override
    public boolean existeRewiew(Usuario u, Local l, LocalDate ld) {
        
    }

    @Override
    public boolean nuevaContestacion(Contestacion c, Review r) {
        
    }

    @Override
    public boolean tieneContestacion(Review r) {
       
    }

    @Override
    public Contestacion obtenerContestacion(Review r) {
        
    }

    @Override
    public boolean eliminaContestacion(Contestacion c) {
        
    }

    @Override
    public boolean eliminaContestacion(Review r) {
        
    }

    @Override
    public boolean nuevoLocal(Local l) {
        
    }

    @Override
    public boolean eliminarLocal(Local l) {
        
    }

    @Override
    public Local obtenerLocal(Direccion d) {
        
    }

    @Override
    public boolean asociarLocal(Local l, Propietario p) {
       
    }

    @Override
    public boolean desasociarLocal(Local l, Propietario p) {
        
    }

    @Override
    public boolean actualizarLocal(Local viejoL, Local nuevoL) {
        
    }

    @Override
    public Review[] verReviews(Local l) {
        
    }

    @Override
    public boolean nuevaReserva(Cliente c, Reservable r, LocalDate ld, LocalTime lt) {
        
    }

    @Override
    public Reserva[] obtenerReservas(Cliente c) {
        
    }

    @Override
    public Reserva[] obtenerReservas(Reservable r) {
        
    }

    @Override
    public Reserva[] obtenerReservas(LocalDate ld) {
        
    }

    @Override
    public boolean eliminarReserva(Reserva r) {
        
    }

    @Override
    public Local[] listarLocales(String ciudad, String provincia) {
        
    }

    @Override
    public Bar[] listarBares(String ciudad, String provincia) {
        
    }

    @Override
    public Restaurante[] listarRestaurantes(String ciudad, String provincia) {
        
    }

    @Override
    public Pub[] listarPubs(String ciudad, String provincia) {
        
    }
    
}
