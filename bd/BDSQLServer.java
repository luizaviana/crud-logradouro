package bd;

import bd.core.*;
import bd.daos.*;

public class BDSQLServer
{
    public static final MeuPreparedStatement COMANDO;

    static
    {
    	MeuPreparedStatement comando = null;

        try
        {
            comando =
                    new MeuPreparedStatement(
                            "com.microsoft.sqlserver.jdbc.SQLServerDriver",
                            "jdbc:sqlserver://regulus.cotuca.unicamp.br:1433;databasename=BD20130",
                            "BD20130", "BD20130");
        }
        catch (Exception erro)
        {
            System.err.println ("Problemas de conexao com o BD");
            System.err.println (erro);
            System.exit(0); // aborta o programa
        }
        
        COMANDO = comando;
    }
}