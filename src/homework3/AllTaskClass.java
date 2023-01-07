package homework3;

public class AllTaskClass {
    public static void main(String[] args) {
        //1
        System.out.println("------------------");
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;

        if (isWeekend && !isRain) {
            canWalk = true;
        } else canWalk = false;

        System.out.println(canWalk);


        //2
        System.out.println("------------------");
        boolean isEdekaOpen = false;
        boolean isReweOpen = false;
        boolean canBuy;

        if (isEdekaOpen || isReweOpen) {
            canBuy = true;
        } else canBuy = false;

        System.out.println("Я могу купить еду, это " + canBuy);


        //3
        System.out.println("------------------");
        int Temperature1 = 101;
        int Temperature2 = 100;
        boolean canWork;

        if (Temperature1 > 100 && Temperature2 < 100) {
            canWork = true;
        } else canWork = false;

        System.out.println("canWork - " + canWork);


        //часы
        System.out.println("------------------");
        int secondToEnd = 1000;  //0 до 28800
        int hourToEnd;
        hourToEnd = secondToEnd / 3600;

        System.out.println(secondToEnd);

        if (hourToEnd > 4) {
            System.out.println("осталось " + hourToEnd + " часов");
        } else if (hourToEnd > 1 && hourToEnd < 5) {
            System.out.println("осталось " + hourToEnd + " часa");
        } else
            System.out.println("осталось менее часа");


        //сломанный лифт
        System.out.println("------------------");
        int H = 200;
        int N = 50;
        int M = 1;
        System.out.println(numberOfLifts(H, N, M));


        //снять деньги
        System.out.println("------------------");
        int D = 21;
        System.out.println(numberOfDays(D));


    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int result = 0;
        int floorTmp = 0;

        while (floorTmp < floor) {
            floorTmp = floorTmp + stepUp - stepDown;
            result += 1;
        }

        return result;
    }


    public static int numberOfDays(int money) {
        int leftMoney = money;
        int result = 0;

        while (leftMoney > 0) {

            if (leftMoney == 1) {
                result += 1;
                leftMoney = 0;
            }

            for (int i = leftMoney - 1; i > 0; i--) {
                if (leftMoney % i == 0) {
                    leftMoney = leftMoney - i;
                    result += 1;
                    break;
                }
            }
        }
        return result;
    }
}
