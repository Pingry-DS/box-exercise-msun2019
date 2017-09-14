public class Box<T>{



  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box(){
    super();
    this.isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T contents){
    super();
    this.isFull = true;
    this.contents = contents;
  }

  /**
   * Check the contents of the box
   */
  public T getContents(){
    return contents;
  }

  /**
   * Tell whether the box is full or not
   */
  public boolean isFull(){
    return isFull;
  }

  /**
   * Empty out the box, and give back whatever was in it
   */
  public T empty(){
    T junk = contents;
    contents = null;
    isFull = false;
    return junk;
  }
  /**
   *
   *
   *
   */
  public boolean fill(T contents){
    if (isFull){
      return false;
    }
    this.contents = contents;
    isFull = true;
    return isFull;
  }
  public String toString(){
    if (isFull){
      return "This box contains " + contents;
    }
    else{
      return "This box is empty";
    }
  }

  public static void main(String[] args){

    // Make two boxes
    Box<String> stringBox = new Box<String>();

    Box<Integer> intBox   = new Box<Integer>(42);

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    stringBox.fill("Hello World");


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox.getContents() + ", " + intBox.getContents());

    //TODO Empty a boxes
    stringBox.empty();
    intBox.empty();


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
