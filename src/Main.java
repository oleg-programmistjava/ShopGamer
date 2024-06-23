import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char delivery;
        double deliveryPrice = 25;

        System.out.println("Добро пожаловать в магазин для геймеров");
        System.out.println("---------------------------------------");
        System.out.println("Сегодня у нас распродажа игровых дисков:");
        System.out.println("На все диски скидка 10%");

        System.out.println("Рассчитать стоимость доставки? (Да/Нет)");
        delivery = keyboard.findWithinHorizon(".",0).charAt(0);

        System.out.println("Доставка составит: " + deliveryPrice);

    }

}
