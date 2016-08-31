package com.sinlov.jar.key.tools;

/**
 * <pre>
 *     sinlov
 *
 *     /\__/\
 *    /`    '\
 *  ≈≈≈ 0  0 ≈≈≈ Hello world!
 *    \  --  /
 *   /        \
 *  /          \
 * |            |
 *  \  ||  ||  /
 *   \_oo__oo_/≡≡≡≡≡≡≡≡o
 *
 * </pre>
 * Created by sinlov on 16/8/31.
 */
public class Main {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                System.out.printf("Please see help!");
            }
            String keyStorePath = args[0];
            String keyStoreType = args[1];
            String password = args[2];
            String alias = args[3];
            String exportedFilePath = args[4];
            ExportPrivateKey export = new ExportPrivateKey(keyStorePath,
                    keyStoreType,
                    password,
                    alias,
                    exportedFilePath
            );
            export.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
