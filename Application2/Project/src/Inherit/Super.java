package Inherit;

public class Super {
    double len ;
    double width; 
    double height; 
    
    public Super()
    {
        len = 1;
        width = 2; 
        height = 3; 
        }
    
  
  public Super(double len, double width, double height)
  {
      this.len = len;
      this.width = width; 
      this.height = height; 
      }
    
    public double volume()
    {
        return len * width * height; 
        }
}
