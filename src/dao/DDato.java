/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Dato;

/**
 *
 * @author Josar
 */
public class DDato {

    private ArrayList<Dato> listaDatos = new ArrayList();
    private Connection con;
    private Conexion conexion = new Conexion();
    private PreparedStatement insertarRegistro;
    private PreparedStatement imprimirRegistro;
    private PreparedStatement modificarRegistro;
    private PreparedStatement eliminarRegistro;

    private final String INSERT = "INSERT INTO Datos(idPaciente, nombreUno, nombreDos, apellidoUno, apellidoDos, cedula, sexo, fNacimiento, telefono, tipoSangre, peso, altura, departamento, municipio, numeroCasa, direccion, aIncapacidad, aHereditarios, aPatologicos, aAlergias, eEjercicio, eDesayuno, horasSuenyo, religion, observacion, tabaquismo, alcoholismo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // 16 / 27
    private final String SELECT = "SELECT * from Datos";
//    private final String UPDATE = "UPDATE Datos SET departamento = ?, municipio = ?, numeroCasa = ?, direccion = ?, telefono = ?, peso = ?, altura = ?,  WHERE idPaciente = ?";
    private final String DELETE = "DELETE FROM Datos WHERE idPaciente = ?";

    public DDato() {
        try {
            con = conexion.obtenerConexion();
            insertarRegistro = con.prepareStatement(INSERT);
            imprimirRegistro = con.prepareStatement(SELECT);
//            modificarRegistro = con.prepareStatement(UPDATE);
            eliminarRegistro = con.prepareStatement(DELETE);

        } catch (SQLException e) {
            Logger.getLogger(DDato.class.getName()).log(Level.SEVERE, null, e);
        }
//        listaDatos = this.listarRegistro();
    }

//   idPaciente, nombreUno, nombreDos, apellidoUno, apellidoDos, cedula, sexo, fNacimiento, telefono, tipoSangre, peso, altura, departamento, municipio, numeroCasa, direccion, aIncapacidad, aHereditario, aPatologicos, aAlergias, eEjercicio, eDesayuno, horasSuenyo, religion, observacion, tabaquismo, alcoholismo

    /**
     *
     * @param datos
     * @return
     */
    public boolean registrarDatos(Dato datos) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setInt(1, datos.getId());
            ps.setString(2, datos.getPrimerNombre());
            ps.setString(3, datos.getSegundoNombre());
            ps.setString(4, datos.getPrimerApellido());
            ps.setString(5, datos.getSegundoApellido());
            ps.setString(6, datos.getCedula());
            ps.setString(7, datos.getSexo());
            ps.setString(8, datos.getfNacimiento());
            ps.setString(9, datos.getTelefono());
            ps.setString(10, datos.getTipoSangre());
            ps.setString(11, datos.getPeso());
            ps.setString(12, datos.getTamaño());
            ps.setString(13, datos.getDepartamento());
            ps.setString(14, datos.getMunicipio());
            ps.setString(15, datos.getnCasa());
            ps.setString(16, datos.getDireccion());
            ps.setString(17, datos.getIncapacidad());
            ps.setString(18, datos.getHereditario());
            ps.setString(19, datos.getPatologico());
            ps.setString(20, datos.getAlergia());
            ps.setString(21, datos.getHaceEjercicios());
            ps.setString(22, datos.getTomaDesayuno());
            ps.setInt(23, datos.getHorasSueño());
            ps.setString(24, datos.getReligion());
            ps.setString(25, datos.getObservacion());
            ps.setString(26, datos.getTabaquismo());
            ps.setString(27, datos.getAlcoholismo());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    System.out.println(e.toString());
                }
            }
        }
    }

    public List<Dato> listar() {
        List<Dato> listaDatos = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SELECT);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Dato dato = new Dato();
                dato.setId(rs.getInt(1));
                dato.setPrimerNombre(rs.getString(2));
                dato.setSegundoNombre(rs.getString(3));
                dato.setPrimerApellido(rs.getString(4));
                dato.setSegundoApellido(rs.getString(5));
                dato.setCedula(rs.getString(6));
                dato.setSexo(rs.getString(7));
                dato.setfNacimiento(rs.getString(8));
                dato.setTelefono(rs.getString(9));
                dato.setDepartamento(rs.getString(10));
                dato.setMunicipio(rs.getString(11));
                dato.setnCasa(rs.getString(12));
                dato.setDireccion(rs.getString(13));
                dato.setTipoSangre(rs.getString(18));
                dato.setPeso(rs.getString(24));
                dato.setTamaño(rs.getString(25));

                listaDatos.add(dato);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                conexion.cerrarConexion(con);
            }
        }
        return listaDatos;
    }

    public boolean eliminar(int id) {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                conexion.cerrarConexion(con);
            }
        }
    }
}