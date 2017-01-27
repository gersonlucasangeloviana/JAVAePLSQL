package br.com.fiap.dao.conect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import br.com.fiap.conexao.ConexaoFactory;

public class DAO {
	
	Connection c = new ConexaoFactory().getConexao();
	
	public void Proc(int i, int p) throws SQLException{
	      String jobquery = "begin ATUALIZA_SALARIO(?, ?); end;";
	      CallableStatement callStmt = c.prepareCall(jobquery);
//	      callStmt.registerOutParameter(3, OracleTypes.CURSOR);
	      callStmt.setInt(1, i);
	      callStmt.setInt(2, p);
	      callStmt.execute();
	      callStmt.close();
	}
	public int Func(int i, int p) throws SQLException{
		CallableStatement ctsmt = c.prepareCall("{? = call somaDois(?,?)}");
		ctsmt.registerOutParameter(1, Types.INTEGER);
		ctsmt.setInt(2, i);
		ctsmt.setInt(3, p);

		ctsmt.execute();
		int retorno = ctsmt.getInt(1);
		ctsmt.close();
		
		return retorno;
	}
}
