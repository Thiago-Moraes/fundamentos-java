package pessoa;

public class Cpf {
    
    public static final int POSITION_FIRST_DIGIT = 11;
    public static final int POSITION_SECOND_DIGIT = 12;
    public static final int MIN_LENGTH = 11;
    public static final int DIVIDER = 11;
    public static final int MAX_LENGTH = 14;
    String cpf = "";
    
    public Cpf(String cpf) {
        String localCpf = this.removeUnecessaryChars(cpf);
        if (!this.isValid(localCpf)) {
            throw new Error("Invalid CPF");
        }

        this.cpf = localCpf;
    }
    
    public boolean isValid(String cpf) {
        if (cpf == null) {
            return false;
        }

        if (this.isEveryEquals(cpf)) {
            return false;
        }

        return cpf.length() >= MIN_LENGTH && this.cpf.length() <= MAX_LENGTH;
    }

    protected boolean isEveryEquals(String cpf) {
        for (int i = 0; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public String removeUnecessaryChars(String cpf) {
        return cpf
            .replace(".", "")
            .replace(".", "")
            .replace("-", "")
            .replace(" ", "");
    }

    int getFactor(int digit) {
        int valueByPosition = 0;
        int factor = 0;
        for (int position = 1; position < this.cpf.length() - 1; position++) {
            int init = position - 1;
            int end = position;
            valueByPosition = Integer.parseInt(this.cpf.substring(init, end));
            factor += (digit - position) * valueByPosition;
        }

        return factor;
    }

    Integer getDigit(int factor) {
        int rest = 0;
        rest = (factor % DIVIDER);
        return (rest < 2) ? 0 : DIVIDER - rest;
    }
    
    public boolean validate() {
        int firstFactor = 0;
        Integer firstDigit = 0;
        int secondfactor = 0;
        Integer secondDigit = 0;

        firstFactor = this.getFactor(POSITION_FIRST_DIGIT);
        firstDigit = this.getDigit(firstFactor);

        secondfactor = this.getFactor(POSITION_SECOND_DIGIT);
        secondfactor += 2 * firstDigit;
        secondDigit = this.getDigit(secondfactor);

        int init = this.cpf.length() - 2;
        int end = this.cpf.length();

        String result = firstDigit.toString().concat(secondDigit.toString());

        return this.cpf.substring(init, end) == result;
    }

    public String getValue() {
        return this.cpf;
    }
}
