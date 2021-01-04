package com.automation.issoft.random;

public class ReadFromFile {



        public String removeSpecials (String withoutSpec){
            withoutSpec.replaceAll("\\P{L}\\P{Z}]", " ");
            return withoutSpec;
            //            System.out.println(withoutSpec);
        }



        public void calcDuplicates (String[] stringArray) {
            for (int i = 0; i < stringArray.length; i++) {
//                stringArray.con

            }

        }
}

//[-_+.^"\:,?'-]
//[\P{L}\P{Z}]