package lsp;

public class Dog extends Animal implements AnimalWalk{
  @Override
  public void makeSound() {
      System.out.println("Dog barks.");
  }
  
  public void Walk() {
      System.out.println("Dog walks.");
  }
}