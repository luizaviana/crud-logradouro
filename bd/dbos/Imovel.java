package bd.dbos;

public class Imovel implements Cloneable {

    private String nomeProprietario, cep, complemento;
    private int codigo;
    private short numero;
    private float valor;

    public int getCodigo() { return this.codigo; }
    public void setCodigo(int codigo) throws Exception {
        if (codigo <= 0)
            throw new Exception("Código Inválido");

        this.codigo = codigo;
    }

    public String getNomeProprietario() {
        return this.nomeProprietario;
    }
    public void setNome(String nome) throws Exception {
        if (nome == null || nome.equals(""))
            throw new Exception("Nome não fornecido");

        this.nomeProprietario = nome;
    }


    public float getValor() {
        return this.valor;
    }
    public void setValor(float v) throws Exception {
        if (v <= 0)
            throw new Exception("Valor invalido");

        this.valor = v;
    }

    public String getCEP() {
        return this.cep;
    }
    public void setCEP(String cep) throws Exception {
        if (cep == null || cep.equals(""))
            throw new Exception("CEP inválido");

        this.cep = cep;
    }

    public short getNumero() { return this.numero; }
    public void setNumero(short numero) throws Exception {
        if (numero <= 0)
            throw new Exception("Número inválido");

        this.numero = numero;
    }

    public String getComplemento() { return this.complemento; }
    public void setComplemento(String complemento) {
        // O complemento pode ser nulo
        this.complemento = complemento;
    }

    public Imovel(int codigo, String nome, float valor, String cep, short numero, String complemento) throws Exception {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setValor(valor);
        this.setCEP(cep);
        this.setNumero(numero);
        this.setComplemento(complemento);
    }

    public String toString() {

        String ret = "";

        ret += "'Código': " + this.codigo + "\n";
        ret += "'Nome': '" + this.nomeProprietario + "'\n";
        ret += "'Valor': " + this.valor + "\n";
        ret += "'CEP': '" + this.cep + "'\n";
        ret += "'Número': " + this.numero + "\n";
        ret += "'Complemento': " + this.complemento;

        return ret;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Imovel))
            return false;

        Imovel imovel = (Imovel) obj;

        if (this.codigo != imovel.codigo)
            return false;

        if (!this.nomeProprietario.equals(imovel.getNomeProprietario()))
            return false;

        if (this.valor != imovel.valor)
            return false;

        if (!this.cep.equals(imovel.getCEP()))
            return false;

        if (this.numero != imovel.numero)
            return false;

        if (!this.complemento.equals(imovel.getComplemento()))
            return false;

        return true;
    }

    public int hashCode() {
        int ret = 666;

        ret = 7 * ret + new Integer(this.codigo).hashCode();
        ret = 7 * ret + this.nomeProprietario.hashCode();
        ret = 7 * ret + new Float(this.valor).hashCode();
        ret = 7 * ret + this.cep.hashCode();
        ret = 7 * ret + new Short(this.numero).hashCode();
        ret = 7 * ret + this.complemento.hashCode();

        return ret;
    }

    // Construtor de Cópia
    public Imovel(Imovel modelo) throws Exception {

        if(modelo == null)
            throw new Exception("Modelo vazio!");

        this.codigo = modelo.codigo;
        this.nomeProprietario = modelo.nomeProprietario;
        this.valor = modelo.valor;
        this.cep = modelo.cep;
        this.numero = modelo.numero;
        this.complemento = modelo.complemento;

    }

    public Object clone() {
        Imovel ret = null;

        try {
            ret = new Imovel(this);
        } catch (Exception e) {
        } // Sei que o this não é nulo.

        return ret;
    }
}
