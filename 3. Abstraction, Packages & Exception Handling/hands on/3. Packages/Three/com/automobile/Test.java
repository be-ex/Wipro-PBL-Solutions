package Three.com.automobile;

import Three.com.automobile.twowheeler.Hero;
import Three.com.automobile.twowheeler.Honda;

class Test {
    public static void main(String[] args) {
        Vehicle hero = new Hero(90, "Splendor plus", "REG156489", "Kali Charan");
        System.out.println("=================== HERO ======================");
        System.out.println("Model name is: " + hero.getModelName());
        System.out.println("Registration number is: " + hero.getRegistrationNumber());
        System.out.println("Owner is: " + hero.getOwnerName());
        System.out.println("=================== HONDA =====================");
        Vehicle honda = new Honda(100, "Shine 125cc", "REG14151", "Lal Charan");
        System.out.println("Model name is: " + honda.getModelName());
        System.out.println("Registration number is: " + honda.getRegistrationNumber());
        System.out.println("Owner is: " + honda.getOwnerName());
    }
}