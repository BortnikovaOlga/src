package ru.bortnikova.task5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Acceptor {
    private static final Logger logger = Logger.getLogger(Acceptor.class.getName());

    public static boolean getMoney(int total, int cancel) {
        int putMoney = 0, addMoney = 0;

        while (true) {
            try {
                addMoney = takeMoney(cancel);
            } catch (AcceptorException e) {
                logger.log(Level.SEVERE, e.getMessage(), e);
                System.out.println(e.getMessage());
                continue;
            } catch (CancellException e) {
                logger.log(Level.INFO, e.getMessage()+"возврат внесенных денег ", e);
                System.out.println(e.getMessage());
                System.out.println("Заберите деньги " + putMoney + " рублей");
                return false;
            }
            putMoney += addMoney;
            if (putMoney < total) {
                System.out.println("недостаточно денег");
                continue;
            }
            System.out.println("возьмите сдачу " + (putMoney - total) + " рублей");
            return true;
        }
    }

    private static int takeMoney(int cancel) throws AcceptorException, CancellException {
        Scanner in = new Scanner(System.in);
        System.out.println("Вставьте купюру, " + cancel + " Отмена");
        int money = in.nextInt();
        // если ввести отрицательное число, то будет считаться, что замялась купюра
        if (money < 0) {
            throw new AcceptorException("замялась купюра, попробуйте снова");
        }
        if (money == cancel) throw new CancellException("Отмена ! ");
        return money;
    }
}
