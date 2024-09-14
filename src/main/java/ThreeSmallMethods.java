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
        char c = personalNumber.charAt(indexOfSecondToLast);




        if (lengthOfPersonalNumber == 10) {

            }

        return true;
    }

    public int firstTwoDigitInteger(int[] numbers) {
        return -1;
    }
}
