public class Calculator {
    public int FirstParam;
    public int SecondParam;

    Calculator(int fristP, int secondP){
        FirstParam = fristP;
        SecondParam = secondP;
    }

    public  void SetFirstParam(int first){
        FirstParam = first;
    }
    public  int GetFirstParam(){
        return FirstParam;
    }
    public  void SetSecParam(int sec){
        SecondParam = sec;
    }


    public  int Add(){
        return (FirstParam + SecondParam);
    }
    public int Sub(){
        return (FirstParam - SecondParam);
    }
    public  int Multiply(){
        return (FirstParam * SecondParam);
    }
    public int Division()
    {
        return (FirstParam / SecondParam);
    }



}

