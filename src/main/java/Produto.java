public abstract class Produto {
    private int idProduto;
    protected String nome;
    private float valido;
    private float fabricado;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValido() {
        return valido;
    }

    public void setValido(float valido) {
        this.valido = valido;
    }

    public float getFabricado() {
        return fabricado;
    }

    public void setFabricado(float fabricado) {
        this.fabricado = fabricado;
    }

    public float calcularTempoValido() {
        return (this.valido - this.fabricado);
    }

    public abstract String verificarValidade();

    public String getCategoria() {
        return "Produto";
    }

    public String getInfo() {
        return getCategoria() + "{" +
                "idProduto=" + this.idProduto +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarValidade() +
                '}';
    }
}
