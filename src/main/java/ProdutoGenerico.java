public class ProdutoGenerico extends Produto{
    public String verificarValidade() {
        if (this.calcularTempoValido() >= 10.0f) {
            return "Valido";
        }
        else {
            return "Reprovado";
        }
    }
}
