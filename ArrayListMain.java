import java.util.*;
import List1.*;
public class ArrayListMain 
{
	static AddElements a=new AddElements();
	static RemoveElements d=new RemoveElements();
	static Print p=new Print();
	
	static int operation;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number,num_of_elements;
		boolean choice=true;
		a.init();
		while(choice) 
		{
		p.printtext("===== Operations on a list of Numericals =====" );
		p.printtext("1. Show current Elements in the list :");
		p.printtext("2. Add Element to the list :");
		p.printtext("3. Add Multiple Elements to the list :");
		p.printtext("4. Remove Elements from the list ");
		p.printtext("5. Remove Multiple Elements from the list");
		p.printtext("6. Print an Element in list");
		p.printtext("7. Print Multiple Elements in list");
		p.printtext("===== Select a Operation to Perform =====");
		
		operation=s.nextInt();
		if(operation<0 && operation>6)
			p.printtext("Invalid Operation Selection ");
			switch(operation)
			{
			case 1:
				p.printtext("The Elements in the List are :");
				p.printobject();
				break;
			case 2:
				p.printtext("Enter the Number You Want to Add in The List :");
				number=s.nextInt();
				a.addElements(number);
				break;
			case 3:
				p.printtext("Enter the Number of Elements you want to add to list:");
				num_of_elements=s.nextInt();
				p.printtext("Enter Elements :");
				for(int i=0;i<num_of_elements;i++) {
					number=s.nextInt();
					a.addElements(number);
					}
				break;				
			case 4:
				p.printtext("Enter the Index of Number You Want to delete in The List :");
				number=s.nextInt();
				d.Delete(number);	
				break;
			case 5:
				p.printtext("Indexes have to choosen Carefully \n After deletion of every element \n the indexes get updated \n");
				p.printtext("Enter the Number of Elements you want to delete in list:");
				num_of_elements=s.nextInt();
				p.printtext("Enter index of Elements :");
				for(int i=0;i<num_of_elements;i++) {
					number=s.nextInt();
					d.Delete(number);	
					}
				break;
			case 6:
				p.printtext("Enter the index of the element to print :");
				number=s.nextInt();
				p.print(number);
				break;
			case 7:
				p.printtext("Enter the Number of the element to print :");
				num_of_elements=s.nextInt();
				p.printtext("Enter index of Elements :");
				for(int i=0;i<num_of_elements;i++) {
					number=s.nextInt();
				p.print(number);
				}
				break;
				
		}
			p.printtext(" ");
			p.printtext("do you want to continue your Operations :");
			p.printtext("True / False ");
			choice=s.nextBoolean();
		
		}
	s.close();

	}
}
