public class Main {

    public static void main(String[] args) {

        int price = 200_000; //цена билета

        int bonus = 20; //количество рублей для одной мили

        int miles = (price / bonus);

        System.out.println("Начислено миль:" + miles);
    }
}
