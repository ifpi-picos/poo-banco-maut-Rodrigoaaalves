import java.text.SimpleDateFormat;
import java.util.Date;

public class Transacao {
    private double valor;
    private Date data;
    private String tipo;

    public Transacao(double valor, String tipo) {
        this.valor = valor;
        this.data = new Date();
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dateFormat.format(data);
        return "Tipo: " + tipo + ", Valor: " + valor + ", Data: " + dataFormatada;
    }
}
