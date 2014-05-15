/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class Step1GenerateSQLInsertIntoCardBank {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("");

        String sql0 = "DELETE FROM CARD_BANK;";

        System.out.println(sql0);
//        new JdbcQryCardUpdCardBank().runQuery(sql0);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        String sql1 = "INSERT INTO CARD_BANK "
                + "("
                + "`ID`,"
                + "`NAME`,"
                + "`AGE`,"
                + "`CIVIL_MILITARY`,"
                + "`TAG`,"
                + "`ACTION`,"
                + "`ICON_POINTS`,"
                + "`EFFECT`,"
                + "`COLOR`,"
                + "`CNT`,"
                + "`TOKEN_WHITE`,"
                + "`TOKEN_RED`,"
                + "`TOKEN_YELLOW`,"
                + "`TOKEN_BLUE`"
                + ") "
                + "SELECT "
                + "`ID`,"
                + "`NAME`,"
                + "`AGE`,"
                + "`CIVIL_MILITARY`,"
                + "`TAG`,"
                + "`ACTION`,"
                + "`ICON_POINTS`,"
                + "`EFFECT`,"
                + "`COLOR`,"
                + "`CNT`,"
                + "`TOKEN_WHITE`,"
                + "`TOKEN_RED`,"
                + "`TOKEN_YELLOW`,"
                + "`TOKEN_BLUE`"
                + "FROM `CARD` ";

        String sql2 = "WHERE CNT>=1 AND CNT <=1";
        for (int k = 1; k <= 7; k++) {
            sql2 = "WHERE CNT>=" + k + ";";
            System.out.println(sql1 + sql2);
            System.out.println("");
            System.out.println("");
            System.out.println("");

//            new JdbcQryCardUpdCardBank().runQuery(sql2);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }
}
