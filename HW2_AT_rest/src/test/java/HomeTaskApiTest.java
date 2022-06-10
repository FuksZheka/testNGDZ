
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import model.Order;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import static net.serenitybdd.rest.RestRequests.given;

public class HomeTaskApiTest {

    Order order;

    @BeforeClass
    public static void prepare() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/")
                .addHeader("api_key", System.getProperty("api.key"))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        RestAssured.filters(new ResponseLoggingFilter());
    }

    @Test
    public void checkObjectSave() {
        Order order = new Order(); // создаём экземпляр POJO объекта Pet

        order.setId(15555);
        order.setPetId(15555);
        order.setQuantity(4);
        order.setComplete(true);
        given()
                .body(order)
                .when()   // КОГДА:
                .post("/store/order")
                .then() // ТОГДА: (указывает, что после этой части будут выполняться проверки-утверждения)
                .statusCode(200); // например проверка кода ответа.он просто выдёргивается из текста ответа


        Order actual = given()
                .pathParam("OrderId", System.getProperty("OrderId")) // System.getProperty("orderId")
                .when()
                .get("/store/order/{OrderId}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Order.class);
        Assert.assertEquals(actual.getId(), order.getId());
    }

    @Test
    public void tetDelete() throws IOException{
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));
        given()
                .pathParam("OrderId",System.getProperty("OrderId"))
                .when()
                .delete("store/order/{OrderId}")
                .then()
                .statusCode(200);
        given().pathParam("OrderId",System.getProperty("OrderId"))
                .when()
                .get("order/{orderId}")
                .then()
                .statusCode(404);
    }
    @Test
    public void inventory(){
        Map inventory = given()
                .when()
                .get("/store/inventory")
                .then()
                .statusCode(200)
                .extract().body().as(Map.class);
        Assert.assertTrue("Inventory не содержит статус sold", inventory.containsKey("sold"));
    }
}
