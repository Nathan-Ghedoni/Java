/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 10/17/2023
 * Program #5
 * File Name: MessageDecryption.java
 */
public class MessageDecryption {

    public static void main(String[] args) {
        String msg = "Zvzg Junegc kzm zg Sgcvemd qtbyujsn mqesgjemj, bzjdsbzjeqezg,\n" +
                "vtceqezg, qnoyjzgzvomj, ydevtmtydsn, zgw jdstnsjeqzv aetvtcemj.\n" +
                "\n" +
                "Wunegc jds Msqtgw Ktnvw Kzn, Junegc ktnfsw xtn jds Ctisngbsgj Qtws\n" +
                "zgw Qoydsn Mqdttv (CQ&QM) zj Avsjqdvso Yznf, Anejzeg'm qtwsanszfegc\n" +
                "qsgjns jdzj yntwuqsw Uvjnz egjsvvecsgqs. Xtn z jebs ds vsw Duj 8,\n" +
                "jds msqjetg kdeqd kzm nsmytgmeavs xtn Csnbzg gzizv qnoyjzgzvomem.\n" +
                "Dsns ds wsiemsw z gubasn tx jsqdgehusm xtn mysswegc jds anszfegc tx\n" +
                "Csnbzg qeydsnm, egqvuwegc ebyntisbsgjm jt jds yns-kzn Ytvemd atbas\n" +
                "bsjdtw, zg svsqjntbsqdzgeqzv bzqdegs jdzj qtuvw xegw msjjegcm xtn\n" +
                "jds Sgecbz bzqdegs. Junegc yvzosw z yeitjzv ntvs eg qnzqfegc\n" +
                "egjsnqsyjsw qtwsw bsmmzcsm jdzj sgzavsw jds Zvvesm jt wsxszj jds\n" +
                "Gzpem eg bzgo qnuqezv sgczcsbsgjm, egqvuwegc jds Azjjvs tx jds\n" +
                "Zjvzgjeq, zgw eg mt wtegc dsvysw keg jds kzn. Ej dzm assg smjebzjsw\n" +
                "jdzj jdem ktnf mdtnjsgsw jds kzn eg Suntys ao btns jdzg jkt osznm\n" +
                "zgw mzisw tisn xtunjssg bevvetg veism.\n";
        String msgCap = msg.toUpperCase(); //Convert lower case letters to upper case
        String decryptKey = "BMGHIKNQVTWJSRYZCXEOULDFPA";
        //Identify letters in a string
        for (int i = 0; i < msg.length(); ++i) {
            
            if (Character.isLetter(msgCap.charAt(i))) {
                System.out.print(decryptKey.charAt(msgCap.charAt(i) - 'A'));
                
            }
            else if (msgCap.charAt(i) == '!') {
                System.out.print("!");
            }
            else if (msgCap.charAt(i) == '.') {
                System.out.print(".");
            }
            else if (msgCap.charAt(i) == ' ') {
                System.out.print(" ");
            }
            else if (msgCap.charAt(i) == '\n') {
                System.out.print("\n");
            }
            else if (msgCap.charAt(i) == ',') {
                System.out.print(",");
            }
        }

    }

}
