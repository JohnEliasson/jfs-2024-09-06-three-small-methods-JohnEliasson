public class ThreeSmallMethods {

    public boolean isYoung(int age) {

        if (age <= 30) {
            return true;
        } else {
            return false;
        }


    }

    public boolean hasLegalGenderManInSweden(String personalNumber){

        int lengthOfPersonalNumber = personalNumber.length();
        int indexOfSecondToLast = lengthOfPersonalNumber -2;
        char secondToLastDigit = personalNumber.charAt(indexOfSecondToLast);

        if (lengthOfPersonalNumber == 10) {
            if (secondToLastDigit % 2 != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public int firstTwoDigitInteger(int[] numbers) {
        return -1;
    }
}
