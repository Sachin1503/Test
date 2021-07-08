class Solution {

    /**
     * Check if a time is between two given times.
     * @param startTime : start time
     * @param endTime : end time
     * @param toBeCheckedTime : given time
     *
    </T> */
    private fun checkIfATimeIsBetweenTwoGivenTimes(
        startTime: Int,
        endTime: Int,
        toBeCheckedTime: Int
    ): Boolean {
        return toBeCheckedTime in startTime..endTime
    }
}
