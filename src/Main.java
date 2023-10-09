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
        System.out.println("Значение переменной number1 с типом int равно " + number1);
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
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
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
        //Задача №6
        int weightBanan = 80;
        int weightMilk = 105;
        int weightPlombir = 100;
        int weightEggs = 70;
        int grPerKg = 1000;
        int weightBreakfastGram = (5 * weightBanan) + (2 * weightMilk) + (2 * weightPlombir) + (4 * weightEggs);
        float weightBreakfastKilo = (float) ((5 * weightBanan) + (2 * weightMilk) + (2 * weightPlombir) + (4 * weightEggs)) / grPerKg;
        System.out.println("Вес спортивного завтрака " + weightBreakfastGram + " в граммах");
        System.out.println("Вес спортивного завтрака " + weightBreakfastKilo + " в килограммах");
        //Задача №7
        int totalWeightKilo = 7;
        int weightProgram1 = 250;
        int weightProgram2 = 500;
        int totalWeightGram = totalWeightKilo * grPerKg;
        int daysProgram1 = totalWeightGram / weightProgram1;
        int daysProgram2 = totalWeightGram / weightProgram2;
        int daysAverage = (daysProgram1 + daysProgram2) / 2;
        System.out.println("Количество дней на похудение, если терять в весе по 250 грамм в день - " + daysProgram1 + " дней");
        System.out.println("Количество дней на похудение, если терять в весе по 500 грамм в день - " + daysProgram2 + " дней");
        System.out.println("Количество дней на похудение в среднем - " + daysAverage + " дней");
        //Задача №8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int increasePerc = 10;
        float salaryMashaInc = (float) (salaryMasha * increasePerc) / 100;
        float salaryDenisInc = (float) (salaryDenis * increasePerc) / 100;
        float salaryKristinaInc = (float) (salaryKristina * increasePerc) / 100;
        float salaryMashaAfter = salaryMasha + salaryMashaInc;
        float salaryDenisAfter = salaryDenis + salaryDenisInc;
        float salaryKristinaAfter = salaryKristina + salaryKristinaInc;
        float salaryYearDiffMasha = 12 * (salaryMashaAfter - salaryMasha);
        float salaryYearDiffDenis = 12 * (salaryDenisAfter - salaryDenis);
        float salaryYearDiffKristina = 12 * (salaryKristinaAfter - salaryKristina);
        System.out.println("Маша теперь получает " +  salaryMashaAfter + " рублей. Годовой доход вырос на " + salaryYearDiffMasha + " рублей");
        System.out.println("Денис теперь получает " +  salaryDenisAfter + " рублей. Годовой доход вырос на " + salaryYearDiffDenis + " рублей");
        System.out.println("Кристина теперь получает " +  salaryKristinaAfter + " рублей. Годовой доход вырос на " + salaryYearDiffKristina + " рублей");


    }
}