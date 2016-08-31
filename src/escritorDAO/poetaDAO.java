/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escritorDAO;

import escritorDT.poetaDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SALA-1
 */
public class poetaDAO extends conexionDB {
    private final static String SQL_INSERT="insert into poeta(nombre, aPaterno, aMaterno, email, pseudonimo,sexo,nacionalidad)values(?,?,?,?,?,?,?)"; 
    private final static String SQL_UPDATE = "update poeta set nombre = ?, aPaterno = ?, aMaterno = ?, email = ?, pseudonimo = ?, sexo = ?, nacionalidad = ? where idPoeta = ?;";
    private final static String SQL_DELETE = "delete from poeta where idPoeta=?;";
    private final static String SQL_SELECT = "select * from poeta where nombre = ? && aPaterno = ?";
    private final static String SQL_SELECTALL = "select * from poeta";

    public poetaDAO() {
        super();
    }
    
    public void create(poetaDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getaPaterno());
        ps.setString(3, dto.getaMaterno());
        ps.setString(4, dto.getEmail());
        ps.setString(5, dto.getPseudonimo());
        ps.setString(6, dto.getSexo());
        ps.setString(7, dto.getNacionalidad());
        ps.executeUpdate();
        cerrar(ps);
    }
    
    public void upDate(poetaDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getaPaterno());
        ps.setString(3, dto.getaMaterno());
        ps.setString(4, dto.getEmail());
        ps.setString(5, dto.getPseudonimo());
        ps.setString(6, dto.getSexo());
        ps.setString(7, dto.getNacionalidad());
        ps.setInt(8, dto.getIdPoeta());
        ps.executeUpdate();
        cerrar(ps);
    }
    public void delete(poetaDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dto.getIdPoeta());
        ps.executeUpdate();
        cerrar(ps);
    }
    
    public poetaDT select(poetaDT dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ps = conn.prepareStatement(SQL_SELECT);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getaPaterno());
        rs=ps.executeQuery();
        if (rs.next()) {
            dto.setIdPoeta(rs.getInt("idPoeta"));
            dto.setNombre(rs.getString("nombre"));
            dto.setaPaterno(rs.getString("aPaterno"));
            dto.setaMaterno(rs.getString("aMaterno"));
            dto.setEmail(rs.getString("email"));
            dto.setPseudonimo(rs.getString("pseudonimo"));
            dto.setSexo(rs.getString("sexo"));
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
        poetaDT dto;
        ps = conn.prepareStatement(SQL_SELECTALL);
        rs=ps.executeQuery();
        while(rs.next()) {
            dto = new poetaDT();
            dto.setIdPoeta(rs.getInt("idPoeta"));
            dto.setNombre(rs.getString("nombre"));
            dto.setaPaterno(rs.getString("aPaterno"));
            dto.setaMaterno(rs.getString("aMaterno"));
            dto.setEmail(rs.getString("email"));
            dto.setPseudonimo(rs.getString("pseudonimo"));
            dto.setSexo(rs.getString("sexo"));
            dto.setNacionalidad(rs.getString("nacionalidad"));
            lista.add(dto);
        }
        return lista;
    }
}
