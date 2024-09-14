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

        if (lengthOfPersonalNumber == 10) {
            int indexOfSecondToLast = lengthOfPersonalNumber -2;
            char secondToLastDigit = personalNumber.charAt(indexOfSecondToLast);
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
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (currentNumber < 0){
                int negativeNumber = Math.abs(currentNumber);
                if (negativeNumber > 9 && negativeNumber < 100){
                    return currentNumber;
                }
            }
            if (currentNumber > 9 && currentNumber < 100){
               return currentNumber;
            }
       }
        return -1;
    }
}
