import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char delivery;
        double deliveryPrice = 25.00;
        double cdPrice = 5.25;
        double totalPrice;

        System.out.println("Добро пожаловать в магазин для геймеров");
        System.out.println("---------------------------------------");
        System.out.println("Сегодня у нас распродажа игровых дисков:");
        System.out.println("На все диски скидка 10%");

        System.out.print("Рассчитать стоимость доставки? (Да/Нет) ");
        delivery = keyboard.findWithinHorizon(".",0).charAt(0);

        if (delivery == 'Д' || delivery == 'д') {

            System.out.println("---");
            System.out.println("Доставка составит: " + deliveryPrice);
            System.out.println("Цена выбранного Вами диска: " + cdPrice + " долларов.");
            System.out.print("Итоговая стоимость диска включая доставку составит: ");
            totalPrice = cdPrice + deliveryPrice;
            System.out.println(totalPrice + " рублей.");

        }

        if (delivery != 'Д' && delivery != 'д' ) {

            System.out.println("---");
            System.out.println("Вы выбрали САМОВЫВОЗ");
            System.out.println("И поэтому - Вы можете забрать Ваш диск в любое удобное для Вас время.");

        }

        System.out.println("Выберите форму оплаты: наличные, карта, курьеру при получении");



    }

}
