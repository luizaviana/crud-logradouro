package bd.daos;

import bd.BDSQLServer;
import bd.core.MeuResultSet;
import bd.dbos.Imovel;

import java.sql.SQLException;


public class Imoveis
{
    public static boolean cadastrado (int codigo) throws Exception {
        boolean ret = false;
        try {
            String sql;

            sql = "SELECT * " +
                    "FROM IMOVEIS " +
                    "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            ret = resultado.first();
        }
        catch (SQLException erro) {
            throw new Exception ("Erro ao procurar imóvel");
        }

        return ret;
    }

    public static void incluir (Imovel imovel) throws Exception
    {
        if (imovel == null)
            throw new Exception ("Imóvel não fornecido");

        try
        {
            String sql;

            sql = "INSERT INTO IMOVEIS " +
                    "(codigo, nomeProprietario, valor, cep, numero, complemento) " +
                    "VALUES " +
                    "(?, ?, ?, ?, ?, ?)";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt(1, imovel.getCodigo());
            BDSQLServer.COMANDO.setString(2, imovel.getNomeProprietario());
            BDSQLServer.COMANDO.setFloat(3, imovel.getValor());
            BDSQLServer.COMANDO.setString(4, imovel.getCEP());
            BDSQLServer.COMANDO.setShort(5, imovel.getNumero());
            BDSQLServer.COMANDO.setString(6, imovel.getComplemento());


            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro) {
            BDSQLServer.COMANDO.rollback();
            throw new Exception ("Erro ao inserir imóvel " + erro );
        }
    }

    public static void excluir (int codigo) throws Exception
    {
        if (!cadastrado (codigo))
            throw new Exception ("Não cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM IMOVEIS " +
                    "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();        }
        catch (SQLException erro)
        {
            BDSQLServer.COMANDO.rollback();
            throw new Exception ("Erro ao excluir imóvel");
        }
    }

    public static void alterar (Imovel imovel ) throws Exception
    {
        if (imovel == null)
            throw new Exception ("Imóvel não fornecido");

        if (!cadastrado (imovel.getCodigo()))
            throw new Exception ("Não cadastrado");


        try
        {
            String sql;

            sql = "UPDATE IMOVEIS " +
                    "SET nomeProprietario = ?, VALOR = ?, CEP = ?, NUMERO = ?, COMPLEMENTO = ? WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, imovel.getNomeProprietario());
            BDSQLServer.COMANDO.setFloat  (2, imovel.getValor ());
            BDSQLServer.COMANDO.setString (3, imovel.getCEP());
            BDSQLServer.COMANDO.setShort  (4, imovel.getNumero());
            BDSQLServer.COMANDO.setString (5, imovel.getComplemento ());
            BDSQLServer.COMANDO.setInt    (6, imovel.getCodigo ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
            BDSQLServer.COMANDO.rollback();
            throw new Exception ("Erro ao atualizar dados de livro " + erro);
        }
    }

    public static Imovel getImovel (int codigo) throws Exception
    {
        if (!cadastrado(codigo))
            throw new Exception("Não há imóvel com este código");

        Imovel ret = null;

        try
        {
            String sql;

            sql = "SELECT * " +
                    "FROM IMOVEIS " +
                    "WHERE CODIGO = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();

            ret = new Imovel (resultado.getInt("CODIGO"),
                    resultado.getString("NomeProprietario"),
                    resultado.getFloat ("VALOR"),
                    resultado.getString("CEP"),
                    resultado.getShort("NUMERO"),
                    resultado.getString("Complemento"));
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao procurar imóvel " + erro);
        }

        return ret;
    }

    public static MeuResultSet getImoveis () throws Exception
    {
        MeuResultSet ret = null;

        try
        {
            String sql;

            sql = "SELECT * FROM IMOVEIS";

            BDSQLServer.COMANDO.prepareStatement (sql);

            ret = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar imóveis");
        }

        return ret;
    }
}
