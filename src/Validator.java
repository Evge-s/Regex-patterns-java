public class Validator {
    String[] userData;
    public Validator(String[] temp){
        userData = temp;
    }

    //try/catch simulation
    public String validationReport(){
        String ans = "";
        if(!NameValid()){
            ans += "Incorrect name";
        }
        if(!AddressValid()){
            ans += "\nIncorrect address";
        }
        if(!PostCodeValid()){
            ans += "\nIncorrect Post code";
        }
        else if(NameValid() && AddressValid() && PostCodeValid()){
            ans += "\nSuccessfully";
        }
        return ans;
    }
    public boolean NameValid(){ return (userData[0].matches("^([A-Z][a-z]+)\\s([A-Z][`'a-z]+)$")); }

    public boolean AddressValid(){
        return userData[1].matches("^([A-Z][a-z]+)\\s([^0][0-9a-f]+)\\/([^0][0-9]+)$");
    }

    public boolean PostCodeValid(){
        return userData[2].matches("^[^0][0-9]+$");
    }

    public static boolean EmailValid(final String email){
        return email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
}
