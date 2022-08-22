public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     var weightOfQneBoxer = 78.2;
     var weightOfSekondBoxer = 82.7;
     var totalWeight = weightOfQneBoxer + weightOfSekondBoxer;
     var differenceWeight = weightOfQneBoxer - weightOfSekondBoxer;
     System.out.println("Общий вес боксеров " + totalWeight);
     System.out.println("Разница в весе боксеров " + differenceWeight);
        var banana = 5;
        var weigtBanana = banana * 80;
        System.out.println ("Общий вес бананов " + weigtBanana);
        var milk = 200;
        var weigtMilk = milk * 1.05;
        System.out.println ("Общий вес молока " + weigtMilk);
        var iceСream = 2;
        var weigtIceСream = iceСream * 100;
        System.out.println ("Общий вес мороженого " + weigtIceСream);
        var eggs = 4;
        var weigtEggs = eggs * 70;
        System.out.println ("Общий вес яиц " + weigtEggs);
        var totalWeightGramm = weigtBanana + weigtmilk + weigtIceСream + weigtEggs;
        System.out.println ("Общий вес в граммах " + totalWeightGramm);
        var totalWeightKilogramm = totalWeightGramm * 0.001;
        System.out.println ("Общий вес в килограммах " + totalWeightKilogramm);
        var loseWeight = 7;
        var fastWeightLoss = 0.5;
        var slowWeightLoss = 0.25;
        var daysFastWeightLoss = loseWeight / fastWeightLoss;
        var daysSlowWeightLoss = loseWeight / slowWeightLoss;
        var daysWeightLoss = (daysFastWeightLoss + daysSlowWeightLoss) / 2;
        System.out.println ("Среднее количество дней для похудения " + daysWeightLoss);
        var Masha = 67760;
        var prizeMasha = Masha * 1.1;
        System.out.println ("Маша теперь получает " + prizeMasha);
        var yearPrizeMasha = prizeMasha * 12;
        var yearMasha = Masha * 12;
        var incomeDifferenceMasha =  yearPrizeMasha - yearMasha;
        System.out.println ("Годовой доход Маши вырос " + incomeDifferenceMasha);
        var Denis = 83690;
        var prizeDenis = Denis * 1.1;
        System.out.println ("Денис теперь получает " + prizeDenis);
        var yearPrizeDenis = prizeDenis * 12;
        var yearDenis = Denis * 12;
        var incomeDifferenceDenis =  yearPrizeDenis - yearDenis;
        System.out.println ("Годовой доход Дениса вырос " + incomeDifferenceDenis);
        var Christina = 76230;
        var prizeChristina = Christina * 1.1;
        System.out.println ("Кристина теперь получает " + prizeChristina);
        var yearPrizeChristina = prizeChristina * 12;
        var yearChristina = Christina * 12;
        var incomeDifferenceChristina =  yearPrizeChristina - yearChristina;
        System.out.println ("Годовой доход Кристины вырос " + incomeDifferenceChristina);



    }
}