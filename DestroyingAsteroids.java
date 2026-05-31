import java.util.Arrays;
//You are given an integer mass, which represents the original mass of a planet. You are further given an integer array asteroids, where asteroids[i] is the mass of the ith asteroid.

// You can arrange for the planet to collide with the asteroids in any arbitrary order. If the mass of the planet is greater than or equal to the mass of the asteroid, the asteroid is destroyed and the planet gains the mass of the asteroid. Otherwise, the planet is destroyed.

// Return true if all asteroids can be destroyed. Otherwise, return false.

public class DestroyingAsteroids {
    public static void main(String[] args) {
        Destroyer solution = new Destroyer();
        int mass = 10;
        int[] asteroids = {3, 9, 19, 5, 21};
        try {
            boolean result = solution.asteroidsDestroyed(mass, asteroids);
            System.out.println(result); // Output: true
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}

class Destroyer {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
            Arrays.sort(asteroids);
           Long currentMass = Long.valueOf(mass);
            for(int asteroid : asteroids){
                if(currentMass < asteroid){
                    return false;
                }
            currentMass += Long.valueOf(asteroid);
            }
            return true;
            }

    }
