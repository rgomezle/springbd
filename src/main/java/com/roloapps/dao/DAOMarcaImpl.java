package com.roloapps.dao;

import java.sql.Connection;
import com.roloapps.beans.Marca;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOMarcaImpl implements DAOMarca {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public void registrar(Marca marca) throws Exception {
		
		String sql="INSERT INTO marca(id,nombre) values(?,?)";
		Connection con = null;
		
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, marca.getId());
			ps.setString(2, marca.getNombre());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
