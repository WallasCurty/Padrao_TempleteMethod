public class ProdutoOriginal extends Produto{
    public String verificarValidade() {
        if (this.calcularTempoValido() >= 12.0f) {
            return "Valido";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getCategoria() {
        return "ProdutoRemedio";
    }

}
