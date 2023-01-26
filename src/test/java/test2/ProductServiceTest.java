package test2;

import de.training.model.Product;
import de.training.service.ProductService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
    Dieser Test bezieht sich auf die Klasse des ProductServiceTests. Dieser nutzt die DAO, um zu arbeiten.
    Ziel soll es sein, dass nur durch Verwendung dieser Klasse auch eine Coverage vom DAO erzielt wird.
 */
public class ProductServiceTest {

    @Test
    void getNameOfProduct(){
        Product p1 = new Product(2, "Bla",21);
        ProductService service = new ProductService();
        service.insertProduct(p1);

        String nameOfProduct = service.getAllProducts().get(0).getName();

        assertEquals("Lars Test", nameOfProduct);
    }
}
