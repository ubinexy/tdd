import java.util.ArrayList;

public class Mommifier {

    public String vowelSplit(String str) {
        int numberOfVowels = countVowels(str);

        if(numberOfVowels > 0.3 * str.length()) {
            return insertBetweenVowels(str);
        }
        return str;
    }

    private int countVowels(String str) {
        int numberOfVowels = 0;
        for(int i=0;i<str.length(); i++) {
            if(isVoewl(str, i)) {
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }

    private String insertBetweenVowels(String str) {
        StringBuilder builder = new StringBuilder();
        int start = 0;
        int end = 1;
        for(; end<str.length(); end++) {
            if(isVoewl(str, end-1) && isVoewl(str, end)) {
                builder.append(str, start, end);
                builder.append("mommy");
                start = end;
            }
        }
        builder.append(str, start, end);
        return builder.toString();
    }


    private boolean isVoewl(String str, int i){
        switch(str.charAt(i)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
