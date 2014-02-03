package helloworld;


public class helloworld {

	public static void main(String[] args) {
if (args.length > 0)
{
	System.out.println(args[0]);
}
else
{
	System.out.println("Il n'y a pas de paramètres");
}
	assert (args.length > 10) : "Oh ! la la !";

	}

}
