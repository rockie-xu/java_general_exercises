package dev.rockie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String fileNameResult = null;

        String FILENAME = "filename";
        String EXTENSION = "extension";

        String[] test = new String[]{
                "extension",
                "gz",
//                "filename",
//                "\\\\sb1009p-v3\\sgfs004$\\ecm\\ecm_sys\\work\\04\\03\\A6\\11E180A6.gz",
                "filenum",
                "1"
        };

        if (!Arrays.asList(test).contains(FILENAME))
        {
            int extensionTagIndex = Arrays.asList(test).indexOf(EXTENSION);
            System.out.println("-----> index of extension: " + extensionTagIndex);

//            int extensionIndex = ++extensionTagIndex;
//            System.out.println("-----> index of extension + 1: " + extensionTagIndex);
            String extensionString = test[++extensionTagIndex];

            fileNameResult = "auto_generated_name.".concat(extensionString);
            System.out.println("-------> assigned filename: " + fileNameResult);

        }

    }
}
