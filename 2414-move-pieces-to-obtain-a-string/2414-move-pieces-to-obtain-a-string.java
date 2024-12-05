class Solution {
       public boolean canChange(String start, String target) {
        // Remove all '_' characters and check if the sequences of L and R match
        String filteredStart = start.replace("_", "");
        String filteredTarget = target.replace("_", "");
        if (!filteredStart.equals(filteredTarget)) {
            return false;
        }

        // Validate the positions of 'L' and 'R'
        int j = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'L' || start.charAt(i) == 'R') {
                // Find the corresponding position in target
                while (target.charAt(j) == '_') {
                    j++;
                }

                // Validate 'L' can only move left and 'R' can only move right
                if ((start.charAt(i) == 'L' && i < j) || (start.charAt(i) == 'R' && i > j)) {
                    return false;
                }

                j++;
            }
        }

        return true;
    }}