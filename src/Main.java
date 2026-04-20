import java.math.BigDecimal;
import java.time.LocalDateTime;
import ru.store.online.model.Adress;
import ru.store.online.model.CartItem;
import ru.store.online.model.Coffee;
import ru.store.online.model.Order;
import ru.store.online.model.Tea;
import ru.store.online.model.User;
import ru.store.online.model.enumeration.Aroma;
import ru.store.online.model.enumeration.CoffeeType;
import ru.store.online.model.enumeration.Country;
import ru.store.online.model.enumeration.Manufacturer;
import ru.store.online.model.enumeration.Package;
import ru.store.online.model.enumeration.Roasting;
import ru.store.online.model.enumeration.Role;
import ru.store.online.model.enumeration.Status;
import ru.store.online.model.enumeration.TeaType;

public class Main {

  public static void main(String[] args) {

    Tea greenTea = new Tea();
    greenTea.setName("Зелёный с жасмином");
    greenTea.setPrice(new BigDecimal("390.50"));
    greenTea.setWeight(100.0f);
    greenTea.setManufacturer(Manufacturer.LIPTON);
    greenTea.setCountry(Country.CHINA);
    greenTea.setaPackage(Package.PAPER);
    greenTea.setTeaType(TeaType.GREEN);
    greenTea.setAroma(Aroma.FLOWER);

    Coffee espresso = new Coffee();
    espresso.setName("Эфиопский эспрессо");
    espresso.setPrice(new BigDecimal("400.89"));
    espresso.setWeight(340);
    espresso.setManufacturer(Manufacturer.RICHARDS);
    espresso.setCountry(Country.SPAIN);
    espresso.setaPackage(Package.PAPER);
    espresso.setCoffeeType(CoffeeType.ROASTED_BEAN);
    espresso.setRoasting(Roasting.MEDIUM);

    CartItem teaItem = new CartItem();
    teaItem.setDrink(greenTea);
    teaItem.setCount(5);

    CartItem coffeeItem = new CartItem();
    coffeeItem.setDrink(espresso);
    coffeeItem.setCount(2);

    CartItem[] cartItems = {teaItem, coffeeItem};

    User user = new User();
    user.setName("Иван");
    user.setLastName("Петров");
    user.setMail("ivan@example.com");
    user.setPhoneNumber("+79991234567");
    user.setLogin("ivan123");
    user.setPassword("secret");
    user.setRole(Role.CUSTOMER);

    Adress address = new Adress(); // название класса из твоего кода
    address.setCity("Москва");
    address.setStreet("Тверская, 12");
    address.setIndex("125009");

    BigDecimal total = BigDecimal.ZERO;
    for (CartItem item : cartItems) {
      BigDecimal itemSum = item.getDrink()
          .getPrice()
          .multiply(BigDecimal.valueOf(item.getCount()));
      total = total.add(itemSum);
    }

    Order order = new Order();
    order.setDate(LocalDateTime.now());
    order.setUsser(user);
    order.setAdress(address);
    order.setCartItemArray(cartItems);
    order.setTotalPrice(total);
    order.setStatus(Status.NEW);

    System.out.println("=Содержимое корзины =");
    for (CartItem item : cartItems) {
      System.out.println(item.toString());
    }

    System.out.println("\n=== Информация о заказе ===");
    System.out.println("Пользователь: " + user.getName() + " " + user.getLastName());
    System.out.println("Адрес: " + address.getCity() + ", " + address.getStreet());
    System.out.println("Дата: " + order.getDate());
    System.out.println("Статус: " + order.getStatus());
    System.out.println("Общая сумма: " + order.getTotalPrice() + " руб.");

  }
}
