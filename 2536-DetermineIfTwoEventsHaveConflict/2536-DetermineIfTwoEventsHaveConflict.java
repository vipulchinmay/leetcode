// Last updated: 04/10/2025, 15:50:04
import java.time.*;
import java.time.format.*;
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        LocalTime start1 = LocalTime.parse(event1[0],DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime end1 = LocalTime.parse(event1[1],DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime start2 = LocalTime.parse(event2[0],DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime end2 = LocalTime.parse(event2[1],DateTimeFormatter.ofPattern("HH:mm"));
        return !end1.isBefore(start2) && !end2.isBefore(start1);
    }
}