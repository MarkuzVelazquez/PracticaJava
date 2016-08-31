/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escritorDAO;

import escritorDT.poemaDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SALA-1
 */
public class poemaDAO extends conexionDB {
    private final static String SQL_INSERT="insert into poema(idPoeta, titulo, tipo, fecha, nacionalidad)values(?,?,?,?,?)"; 
    private final static String SQL_UPDATE = "update poema set idPoeta = ?, titulo = ?, tipo = ?, fecha = ?, nacionalidad = ? where idPoema = ?;";
    private final static String SQL_DELETE = "delete from poema where idPoema=?;";
    private final static String SQL_SELECT = "select * from poema where titulo = ? && tipo = ?";
    private final static String SQL_SELECTALL = "select * from poema";

    public poemaDAO() {
        super();
    }
    
    public void create(poemaDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_INSERT);
        ps.setInt(1, dto.getIdPoeta());
        ps.setString(2, dto.getTitulo());
        ps.setString(3, dto.getTipo());
        ps.setDate(4, dto.getFecha());
        ps.setString(5, dto.getNacionalidad());
        ps.executeUpdate();
        cerrar(ps);
    }
    
    public void upDate(poemaDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_UPDATE);
        ps.setInt(1, dto.getIdPoeta());
        ps.setString(2, dto.getTitulo());
        ps.setString(3, dto.getTipo());
        ps.setDate(4, dto.getFecha());
        ps.setString(5, dto.getNacionalidad());
        ps.setInt(6, dto.getIdPoema());
        ps.executeUpdate();
        cerrar(ps);
    }
    public void delete(poemaDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dto.getIdPoema());
        ps.executeUpdate();
        cerrar(ps);
    }
    
    public poemaDT select(poemaDT dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ps = conn.prepareStatement(SQL_SELECT);
        ps.setString(1, dto.getTitulo());
        ps.setString(2, dto.getTipo());
        rs=ps.executeQuery();
        if (rs.next()) {
            dto.setIdPoema(rs.getInt("idPoema"));
            dto.setIdPoeta(rs.getInt("idPoeta"));
            dto.setTitulo(rs.getString("titulo"));
            dto.setTipo(rs.getString("tipo"));
            dto.setFecha(rs.getDate("fecha"));
            dto.setNacionalidad(rs.getString("nacionalidad"));
        }
        else
            return null;
        return dto;
    }
    
    public List selectall() throws Exception {
        List lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        poemaDT dto;
        ps = conn.prepareStatement(SQL_SELECTALL);
        rs=ps.executeQuery();
        while(rs.next()) {
            dto = new poemaDT();
            dto.setIdPoema(rs.getInt("idPoema"));
            dto.setIdPoeta(rs.getInt("idPoeta"));
            dto.setTitulo(rs.getString("titulo"));
            dto.setTipo(rs.getString("tipo"));
            dto.setFecha(rs.getDate("fecha"));
            dto.setNacionalidad(rs.getString("nacionalidad"));
            lista.add(dto);
        }
        return lista;
    }
}
