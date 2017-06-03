package FacotryMethods;


public final class ComplexNumber 
{

  public static ComplexNumber valueOf(float aReal, float aImaginary)
  {
    return new ComplexNumber(aReal, aImaginary);
  }

  private float fReal;
  private float fImaginary;
  
  public ComplexNumber(float aReal, float aImaginary)
  {
    fReal = aReal;
    fImaginary = aImaginary;
  }

}

 

