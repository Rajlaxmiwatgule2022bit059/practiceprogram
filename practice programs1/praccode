 class SY2022bit059 {
    public static void main(String[] args) {
        String[] regiNumbers = {"2022bct059", "2026cse833", "2023bce459", "2003bme010"};

        for (String regNumber : regiNumbers) {
            String year = regNumber.substring(0, 4);
            String department = regNumber.substring(4, 7).toUpperCase(); // Converting to uppercase for case-insensitive comparison.
            String sequence = regNumber.substring(7, 9);

            int yearValue = Integer.parseInt(year); // Typecasting from string to integer.

            if (yearValue > 2000 && yearValue < 2025 &&
                (department.equals("CSE") || department.equals("BIT") || department.equals("BCE") || department.equals("BME")) &&
                isValidSequence(sequence)){
                
                }
                }
                
        

        // Count of valid registrations
        int validCount = getValidRegistrationsCount(regiNumbers);
        System.out.println("Count of valid registrations: " + validCount);
    }

    public static int getValidRegistrationsCount(String[] registrations) {
        int validCount = 0;
        for (String regNumber : registrations) {
            String year = regNumber.substring(0, 4);
            String department = regNumber.substring(4, 7).toUpperCase();  
            String sequence = regNumber.substring(7, 9);

            int yearValue = Integer.parseInt(year); 

            if (yearValue > 2000 && yearValue < 2025 &&
                (department.equals("CSE") || department.equals("INFT") || department.equals("BCE") || department.equals("BME")) &&
                isValidSequence(sequence)) {
                validCount++;
            }
        }

        return validCount;
    }

    private static boolean isValidSequence(String sequence) {
        try {
            int sequenceValue = Integer.parseInt(sequence);
            return sequenceValue >= 1 && sequenceValue <= 999;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

