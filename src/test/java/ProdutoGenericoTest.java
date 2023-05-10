import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ProdutoGenericoTest {
    @Test
    void deveRetonarValido() {
        ProdutoGenerico produtoGenerico = new ProdutoGenerico();
        produtoGenerico.setValido(30.0f);
        produtoGenerico.setFabricado(41.0f);
        assertEquals("Valido", produtoGenerico.verificarValidade());
    }

    @Test
    void deveRetonarReprovado() {
        ProdutoGenerico produtoGenerico = new ProdutoGenerico();
        produtoGenerico.setValido(12.0f);
        produtoGenerico.setFabricado(16.0f);
        assertEquals("Reprovado", produtoGenerico.verificarValidade());
    }

    @Test
    void deveRetornarInformacoesProduto() {
        ProdutoGenerico produtoGenerico = new ProdutoGenerico();
        produtoGenerico.setValido(12.0f);
        produtoGenerico.setFabricado(16.0f);
        produtoGenerico.setNome("Dipirona");
        produtoGenerico.setIdProduto(1);
        assertEquals("Produto{idProduto=1, nome='Dipirona', resultado=Reprovado}", produtoGenerico.getInfo());
    }
}
