public class leetAlfabet {
    public String  conversor(char letter){
        String aux;
        letter = Character.toUpperCase(letter);
        switch (letter){
            case 'A': aux = "4 ";
            break;
            case 'B': aux = "|3 ";
                break;
            case 'C': aux = "[ ";
                break;
            case 'D':aux = ") ";
                break;
            case 'E':aux = "3 ";
                break;
            case 'F':aux = "|= ";
                break;
            case 'G':aux = "& ";
                break;
            case 'H':aux = "# ";
                break;
            case 'I':aux = "1 ";
                break;
            case 'J':aux = ",_| ";
                break;
            case 'K':aux = ">| ";
                break;
            case 'L':aux = "1 ";
                break;
            case 'M':aux = "/|/| ";
                break;
            case 'N':aux = "^/ ";
                break;
            case 'O':aux = "0 ";
                break;
            case 'P':aux = "|* ";
                break;
            case 'Q':aux = "(_,) ";
                break;
            case 'R':aux = "|2 ";
                break;
            case 'S':aux = "5 ";
                break;
            case 'T':aux = "7 ";
                break;
            case 'U':aux = "(_) ";
                break;
            case 'V':aux = "|/ ";
                break;
            case 'W':aux = "|/|/ ";
                break;
            case 'X':aux = ">< ";
                break;
            case 'Y':aux = "`/ ";
                break;
            case 'Z':aux = "2 ";
                break;
            default:aux = "     ";
        }
        return aux;
    }
    
    public String leet(String text){
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            build.append(conversor(text.charAt(i)));
        }
        return build.toString();
    }

    public leetAlfabet() {
    }
}
