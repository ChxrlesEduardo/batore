package ex;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail{
    private String numero;

    public NotaFiscal (int numero) {
    }
    public void adicionarPedido(String produto) {
    }

    @Override
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de número: " + numero);

    }
    @Override
    public void enviar(String email) {
        System.out.println("Vamos enviar essa nota fiscal de número: " + numero);
    }
}
