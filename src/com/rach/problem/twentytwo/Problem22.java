package com.rach.problem.twentytwo;

public class Problem22 {

//    String arr[] = {"quick", "brown", "the", "fox"};
//    String expected[] = {"the", "quick", "brown", "fox"};
//    String strOfWords = "thequickbrownfox";

    public static String[] solve1(String[] arr, String str){
        String words[] = new String[arr.length];
        for (int i = 0; i < arr.length; i ++){
            // For each word...
            String word = arr[i];
            for (int letter = 0; letter < str.length(); letter++){
                // For each letter...
                if(word.charAt(0)==str.charAt(letter)){
                    String found = "";
                    found += str.charAt(letter);
                    int index = letter + 1;
                    int count = 1;
                    while(found.length()<word.length()){
                        if(word.charAt(count)==str.charAt(index)){
                            found += str.charAt(index);
                            index += 1;
                            count += 1;
                        } else {
                            break;
                        }
                    }
                    words[i] = found;
                }

            }
        }


        return words;
    }


    //    String arr[] = {"quick", "brown", "the", "fox"};
//    String expected[] = {"the", "quick", "brown", "fox"};
//    String strOfWords = "thequickbrownfox";

    public static String[] solve2(String[] arr, String str){

        String words[] = new String[arr.length];

        for (int i = 0; i < str.length(); i ++){
            // For each letter...
            char ch = str.charAt(0);
            for (int j = 0; j < arr.length; j++ ) {
                // For each word...
                String word = arr[j];
                int count = 0;
                StringBuilder sb = new StringBuilder();
                while((count < word.length()) && word.charAt(count++)==str.charAt(i+count)){
                    System.out.println(str.charAt(i+count));
                    sb.append(str.charAt(i+count));
                }
                if (sb.length() > 1){
                    words[0] = sb.toString();
                }
            }

        }


        return words;
    }

}
