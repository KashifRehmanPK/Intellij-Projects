public class Calculator {


    //// Properties
    public int FirstParam;
    public int SecondParam;

    //// Constructor


    ////// Getter & Setters
    public  void SetFirstParam(int first){
        FirstParam = first;
    }
    public  int GetFirstParam(){
        return FirstParam;
    }



    //// Action Methods
    public  int Add(){
        return (FirstParam + SecondParam);
    }


}
