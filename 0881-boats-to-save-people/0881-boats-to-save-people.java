
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        int boats = 0;

        while (i <= j) {

            // Agar sabse halka aur sabse bhaari saath ja sakte hain
            if (people[i] + people[j] <= limit) {
                i++;
            }

            // Sabse bhaari hamesha is boat mein jayega
            j--;

            // Ek boat use hui
            boats++;
        }

        return boats;
    }
}