public class Main {
    public static void main(String[] args) {
        short ticketPrice = 1555; // стоимости билета
        byte bonusMile = 20; // начислено рублей для одной бонусной милли
        short milesCredited = (short) (ticketPrice / bonusMile); // Начислено бонусных миль
        System.out.println("Начислно " + milesCredited + " бонусных миль");

    }
}
