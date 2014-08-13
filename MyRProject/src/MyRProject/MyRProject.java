package MyRProject;

//My First Git
public class MyRProject {
	
	public static void main(String [] args) {
		
		Recipies one = new Recipies();
		one.setRecipeName("MyFirstRecipe");
		one.setRecipeNumber(1);
		
		Recipies two = new Recipies();
		two.setRecipeName("MySecondRecipe");
		two.setRecipeNumber(2);
		
		System.out.println(one.getRecipeName());
		System.out.println(two.getRecipeName());
	}
}
