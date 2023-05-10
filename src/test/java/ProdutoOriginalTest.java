import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ProdutoOriginalTest {
    @Test
    void deveRetonarValido() {
        ProdutoOriginal produtoOriginal = new ProdutoOriginal();
        produtoOriginal.setValido(12.0f);
        produtoOriginal.setFabricado(25.0f);
        assertEquals("Valido", produtoOriginal.verificarValidade());
    }

    @Test
    void deveRetonarReprovado() {
        ProdutoOriginal produtoOriginal = new ProdutoOriginal();
        produtoOriginal.setValido(12.0f);
        produtoOriginal.setFabricado(23.0f);
        assertEquals("Reprovado", produtoOriginal.verificarValidade());
    }

    @Test
    void deveRetornarInformacoesProduto() {
        ProdutoOriginal produtoOriginal = new ProdutoOriginal();
        produtoOriginal.setValido(12.0f);
        produtoOriginal.setFabricado(23.0f);
        produtoOriginal.setNome("Dipirona");
        produtoOriginal.setIdProduto(5);
        assertEquals("Produto{idProduto=5, nome='Dipirona', resultado=Valido}", produtoOriginal.getInfo());
    }
}
