public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Вторая домашка с переменными
        //Задача № 1
        int number1 = 1000000;
        byte number2 = 1;
        short number3 = 11111;
        long number4 = 123456789L;
        float number5 = 3.5f;
        double number6 = 3.14;
        System.out.println("Значение переменной number1 с    типом int равно " + number1);
        System.out.println("Значение переменной number2 с типом byte равно " + number2);
        System.out.println("Значение переменной number3 с типом short равно " + number3);
        System.out.println("Значение переменной number4 с типом long равно " + number4);
        System.out.println("Значение переменной number5 с типом float равно " + number5);
        System.out.println("Значение переменной number6 с типом double равно " + number6);
        //Задача № 2
        double num1 = 27.12;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        int num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
        //Задача № 3
        int lpPupil = 23;
        int asPupil = 27;
        int eaPupil = 30;
        int totalSheets = 480;
        int totalPupil = lpPupil + asPupil + eaPupil;
        int pupilSheets = totalSheets / totalPupil;
        System.out.println("На каждого ученика рассчитано " + pupilSheets + " листов бумаги");
        //Задача №4
        int effMachine2Min = 16;
        int effMachine20Min = (effMachine2Min / 2) * 20;
        int effMachineDay = (effMachine2Min / 2) * 60 * 24;
        int effMachine3Day = (effMachine2Min / 2) * 60 * 24 * 3;
        int effMachineMonth = (effMachine2Min / 2) * 60 *24 * 30;
        System.out.println("За 20 минут машина произвела " + effMachine20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + effMachineDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + effMachine3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + effMachineMonth + " штук бутылок");
        //Задача №5
        int totalPots = 120;
        int whitePots = 2;
        int brownPots = 4;
        int officePots = whitePots + brownPots;
        int totalOffices = totalPots / officePots;
        int totalWhitePots = totalOffices * whitePots;
        int totalBrownPots = totalOffices * brownPots;
        System.out.println("В школе, где " + totalOffices + " классов, нужно " + totalWhitePots + " банок белой краски и " + totalBrownPots + " банок коричневой краски");



    }
}