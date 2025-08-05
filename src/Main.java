//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int a = 40000;
        byte b = 100;
        short c = 20000;
        long d = 3000000;
        float e = 1.5f;
        double f = 2.550f;
        System.out.println("Значение с типом переменной int = " + a);
        System.out.println("Значение с типом переменной byte = " + b);
        System.out.println("Значение с типом переменной short = " + c);
        System.out.println("Значение с типом переменной long = " + d);
        System.out.println("Значение с типом переменной float = " + e);
        System.out.println("Значение с типом переменной double = " + f);

        System.out.println("Задача 2");
        float a1 = 27.12f;
        long b1 = 987_678_965_549L;
        double c1 = 2.786;
        short d1 = 569;
        short e1 = -159;
        int f1 = 27897;
        byte g1 = 67;

        System.out.println("Задача 3");
       byte lydmilaPavlovnaStudents = 23;
       byte annaSergeevnaStudents = 27;
       byte ekaterinaAndreevnaStudents = 30;
       short paperQuantity = 480;
       short allStudents = (short) (lydmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents);
       short paperForStudent = (short) (paperQuantity / allStudents);
        System.out.println("На каждого ученика рассчитано по " + paperForStudent + " листов бумаги.");

        System.out.println("Задача 4");
        byte machinePerfomancePer2minutes = 16;
        short machinePerfomacePer20minutes = (short) (machinePerfomancePer2minutes * 10);
        int machinePerfomancePerDay =  (machinePerfomacePer20minutes * 3) * 24;
        int machinePerfomancePer3Days = machinePerfomancePerDay * 3;
        int machinePerfomancePerMonth = machinePerfomancePerDay * 31;
        System.out.println("За 20 минут машина произвела " +machinePerfomacePer20minutes +" штук бутылок. ");
        System.out.println("За сутки машина произвела " +machinePerfomancePerDay + " штук бутылок.");
        System.out.println("За три дня машина произвела " +machinePerfomancePer3Days + " штук бутылок.");
        System.out.println("За месяц машина произвела " +machinePerfomancePerMonth + " штук бутылок.");

        System.out.println("Задача 5");
        byte totalPaintCans = 120;
        byte whitePaintCansPerClass = 2;
        byte brownPaintCansPerClass = 4;
        byte totalPaintCansPerClass = (byte) (whitePaintCansPerClass + brownPaintCansPerClass);
        byte totalClasses = (byte) (totalPaintCans / totalPaintCansPerClass);
        byte totalWhitePaintCans = (byte) (whitePaintCansPerClass * totalClasses);
        byte totalBrownPainCans = (byte) (brownPaintCansPerClass * totalClasses);
        System.out.println("В школе,где " +totalClasses +" классов,нужно " +totalWhitePaintCans + " банок белой краски и " +totalBrownPainCans +" банок коричневой краски." );

        System.out.println("Задача 6");
        short bananaWeightInGrams = 80 * 5;
        short milkWeightInGrams = 105 * 2;
        short iceCreamWeightInGrams = 100 * 2;
        short eggWeightInGrams = 70 * 4;
        short totalGramsWeight = (short) (bananaWeightInGrams + milkWeightInGrams + iceCreamWeightInGrams + eggWeightInGrams);
        float totalKilogramsWeight = (float) (totalGramsWeight / 1000.0);
        System.out.println("Вес завтрака в граммах = " +totalGramsWeight +" грамм, вес завтрака в килограммах = " +totalKilogramsWeight +" кг." );

        System.out.println("Задача 7");
        byte needWeightLossKilos = 7;
        short weightLossPerDay250InGrams = 250;
        short weightLossPerDay500InGrams = 500;
        short daysIfWeightLoss250Grams = (short) ((needWeightLossKilos * 1000) / weightLossPerDay250InGrams);
        short daysIfWeightLoss500Grams = (short) ((needWeightLossKilos * 1000) / weightLossPerDay500InGrams);
        System.out.println("Если в день скидывать по 250 грамм то для того чтобы скинуть 7 кг потребуется " +daysIfWeightLoss250Grams +" дней, а если по 500 грамм в день потребуется " +daysIfWeightLoss500Grams +" дней.");

        System.out.println("Задание 8");
        int mashaSalaryPerMonth = 67760;
        int denisSalaryPerMonth = 83690;
        int kristinaSalaryPerMonth = 76230;
        float percentageIncreaseSalary = (float) (1 + 0.10);
        int mashaIncreasedSalary = (int) (mashaSalaryPerMonth * percentageIncreaseSalary);
        int denisIncreasedSalary = (int) (denisSalaryPerMonth * percentageIncreaseSalary);
        int kristinaIncreasedSalary = (int) (kristinaSalaryPerMonth * percentageIncreaseSalary);
        int mashaSalaryDifferencePerYear = (int) ((mashaIncreasedSalary - mashaSalaryPerMonth) * 12);
        int denisSalaryDifferencePerYear = (int) ((denisIncreasedSalary - denisSalaryPerMonth) * 12);
        int kristinaSalaryDifferencePerYear = (int) ((kristinaIncreasedSalary - kristinaSalaryPerMonth) * 12);
        System.out.println("Маша теперь получает " +mashaIncreasedSalary +" рублей. Годовой доход вырос на " +mashaSalaryDifferencePerYear +" рублей.");
        System.out.println("Денис теперь получает " +denisIncreasedSalary +" рублей. Годовой доход вырос на " +denisSalaryDifferencePerYear +" рублей.");
        System.out.println("Кристина теперь получает " +kristinaIncreasedSalary +" рублей. Годовой доход вырос на " +kristinaSalaryDifferencePerYear + " рублей.");










         }
}