/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2__gabrielamontes;

/**
 *
 * @author Gabriela Montes
 */
public class Usuario {
    private String usuarionombre;
    private int usuarioedad;
    private String usuariousername;
    private String usuariocontraseña;

    public Usuario() {
    }

    public Usuario(String usuarionombre, int usuarioedad, String usuariousername, String usuariocontraseña) {
        this.usuarionombre = usuarionombre;
        this.usuarioedad = usuarioedad;
        this.usuariousername = usuariousername;
        this.usuariocontraseña = usuariocontraseña;
    }

    public String getUsuarionombre() {
        return usuarionombre;
    }

    public void setUsuarionombre(String usuarionombre) {
        this.usuarionombre = usuarionombre;
    }

    public int getUsuarioedad() {
        return usuarioedad;
    }

    public void setUsuarioedad(int usuarioedad) {
        this.usuarioedad = usuarioedad;
    }

    public String getUsuariousername() {
        return this.usuariousername;
    }

    public void setUsuariousername(String usuariousername) {
        this.usuariousername = usuariousername;
    }

    public String getUsuariocontraseña() {
        return usuariocontraseña;
    }

    public void setUsuariocontraseña(String usuariocontraseña) {
        this.usuariocontraseña = usuariocontraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuarionombre=" + usuarionombre + ", usuarioedad=" + usuarioedad + ", usuariousername=" + usuariousername + ", usuariocontrase\u00f1a=" + usuariocontraseña + '}';
    }
    
    
}
