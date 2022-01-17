
package Model;


/**
 *
 * @author Everton Costa
 */
public class Contas {
    private String tipo_conta;
    private String instituicao_financeira;
    private double saldo;

    public Contas(String tipo_conta, String instituicao_financeira, double saldo) {
        this.tipo_conta = tipo_conta;
        this.instituicao_financeira = instituicao_financeira;
        this.saldo = saldo;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public String getInstituicao_financeira() {
        return instituicao_financeira;
    }

    public void setInstituicao_financeira(String instituicao_financeira) {
        this.instituicao_financeira = instituicao_financeira;
    }

    public double getSaldo() {
        return saldo;
    }

   // public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


   

}
