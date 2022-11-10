//source code from the jdk
package lesson3.javalabel;
//Java program to illustrate the behavior of
public class Label  {
//	Declaring them as static final will help you to create a CONSTANT. Only one copy of variable exists which can’t be reinitialize.
	// static final  variable
    public static final int LEFT 	= 0;
    public static final int CENTER 	= 1;
    public static final int RIGHT 	= 2;

    String text;
    int alignment = LEFT;
    
    // Create a class constructor for the DateCalendarSamples class with pattern parameter
//  The constructor is called when an object of a class Label is created(instantiated) on the main method. 
    public Label(String text, int alignment)  {
//    	the value of local variable "text"  going to be assigned to class level variable "text"
			this.text = text;
//			invoke setAlignment method one parameter alignment to assign the class level variable alignment
			setAlignment(alignment);
    }
    public int getAlignment() {
			return alignment;
    }
    
//  crate setAlignment method
    public String getText() {
    	 // this line return the value class level variable alignment  .
		return text;
    }

//  crate setAlignment method
    public synchronized void setAlignment(int alignment) {
    	
//    	defining switch statement 
			switch (alignment) {
	  			case LEFT:
	  			case CENTER:
	  			case RIGHT:
	    			this.alignment = alignment;
 	    			return;
			}
			throw new IllegalArgumentException("improper alignment: " +
                                               alignment);
    }
    
    public void setText(String text) {
	  		synchronized (this) {
	    	if (text != this.text && (this.text == null ||
				      !this.text.equals(text))) {

	        		this.text = text;
	    }
	  }
    }  
    
    //Label class
    public static void main(String[] args)  {
    	
    	Label label = new Label("Hi there!", LEFT);
    	//Label label2 = new Label("text", 17);
    	
    	
    	label.setAlignment(RIGHT);
    	//Can access instance variables that 
    	//are visible with "dot" notation
    	System.out.println("Alignment: " + label.alignment);
    	//Better to access data using getters
    	System.out.println("Alignment: " + label.getAlignment());
    	System.out.println("Text: " + label.getText()); 
    	
    	//try creating a second label to see object reference effect
    	Label l = new Label("Hello", LEFT);
    	Label another = l;
    	
//    	invoke setText method to set "Goodbye" to class level variable
    	another.setText("Goodbye");
//    	invoke getText method to get the value of class level variable text and print it on screen
    	System.out.println(another.getText());
//    	
    	
    }
}
