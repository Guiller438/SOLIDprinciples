package srp;

class UserRepository{
    private void saveToDatabase(UserManager user) {
      System.out.println("Saving user to the database...");
      System.out.println("Email: " + user.getEmail());
      System.out.println("Password: " + user.getPassword());
  }
}