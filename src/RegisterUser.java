public class RegisterUser {
   public static void registerUser(String name, int age)throws InvalidAgeException  {
        if (age < 18 || age > 120) {
            throw new InvalidAgeException(
                    "Yanlış yaş: " + age + " (yaş 18 ilə 120 arasında olmalıdır)");
        }
        System.out.println(name + " uğurla qeydiyyatdan keçdi (yaş: " + age + ")");
    }
}
